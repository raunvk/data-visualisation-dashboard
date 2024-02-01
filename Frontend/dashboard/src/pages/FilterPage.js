import { React, useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { FilterCard } from '../components/FilterCard';

import './FilterPage.scss';

export const FilterPage = () => {

    const [records, setRecords] = useState([]);
    const { filter } = useParams();

    useEffect(() => {
        const fetchRecords = async () => {
            const response = await fetch(`http://localhost:8080/data/${filter}/`);
            const info = await response.json();
            setRecords(info);
            console.log(info);
        };
    
        fetchRecords();
    }, [filter]);

    if(!Array.isArray(records) || records.length === 0){
        return <div className='CatalogPage'>
                  <div className='heading'>
                    <h1 className='noData'>⚠︎ Data Unavailable</h1>
                  </div>
                </div>
    }

    let keyword = filter.toUpperCase();
    
    return (
        <div className='FilterPage'>
            <div className='headerSection'>
                <h1 className='appName'>➤ Select {keyword}</h1>
            </div>
            <div className='filterGrid'>
                {records.map(record => (
                    <FilterCard record={record} filter={filter} />
                ))}
            </div>
        </div>
    );
}
  