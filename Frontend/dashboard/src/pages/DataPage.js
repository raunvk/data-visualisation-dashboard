import { React, useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { MajorCard } from '../components/MajorCard';
import { MinorCard1 } from '../components/MinorCard1';
import { MinorCard2 } from '../components/MinorCard2';

import './DataPage.scss';

export const DataPage = () => {
    
  const [data, setData] = useState([]);
  const { entryId } = useParams();

  useEffect(
    () => {
        const fetchData = async () => {
          const response = await fetch(`http://localhost:8080/data/id/${entryId}`);
          const info = await response.json();
          setData(info);
          console.log(info);
        };
        fetchData();
    }, []
  );
  
  if(!data || !data.entryId){
    return <div className='DataPage'>
              <div className='noData'>
                <h1 className='insight'>⚠︎ Data Unavailable</h1>
              </div>
            </div>
  }

  return (
    <div className='DataPage'>
      <div className='heading'>
        <h1 className='insight'>➤<a href={data.url} target='_blank' rel='noopener noreferrer'> {data.insight}</a></h1>
      </div>
      <div className='major'>
        <MajorCard data={data}/>
      </div>
      <div className='minorData'>
        <MinorCard1 data={data}/>
      </div>
      <div className='minorMetric'>
        <MinorCard2 data={data}/>
      </div>
    </div>
  );
}
  