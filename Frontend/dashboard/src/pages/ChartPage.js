import { React, useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { ChartCard } from '../components/ChartCard';

import './ChartPage.scss';

export const ChartPage = () => {
    
  const [records, setRecords] = useState([]);
  const { filter } = useParams();

  useEffect(
    () => {
        const fetchRecords = async () => {
          const response = await fetch(`http://localhost:8080/data/chart/${filter}/`);
          const info = await response.json();
          const recordsArray = Object.keys(info).map(key => ({ key, value: info[key] }));
          setRecords(recordsArray);
          console.log(recordsArray);
        };
        fetchRecords();
    }, [filter]
  );
  
  if(!Array.isArray(records) || records.length === 0){
    return <div className='CatalogPage'>
              <div className='heading'>
                <h1 className='noData'>⚠︎ Data Unavailable</h1>
              </div>
            </div>
  }

  let keyword = filter.toUpperCase();

  return (
    <div className='ChartPage'>
      <div className='heading'>
        <h1>➤ {keyword} Chart</h1>
      </div>
      <div className='major'>
      <ChartCard records={records} />
      </div>
    </div>
  );
}
  