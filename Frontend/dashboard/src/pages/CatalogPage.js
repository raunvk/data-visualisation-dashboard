import { React, useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { CatalogCard } from '../components/CatalogCard';

import './CatalogPage.scss';

export const CatalogPage = () => {

    const [records, setRecords] = useState([]);
    const { startYear, endYear, topic, sector, region, swot, pestle, source, city, country } = useParams();

    useEffect(
        () => {
            const fetchRecords = async () => {
                let url;
                if(startYear) url = `http://localhost:8080/data/startyear/${startYear}`;
                else if(endYear) url = `http://localhost:8080/data/endyear/${endYear}`;
                else if(topic) url = `http://localhost:8080/data/topic/${topic}`;
                else if(sector) url = `http://localhost:8080/data/sector/${sector}`;
                else if(region) url = `http://localhost:8080/data/region/${region}`;
                else if(swot) url = `http://localhost:8080/data/swot/${swot}`;
                else if(pestle) url = `http://localhost:8080/data/pestle/${pestle}`;
                else if(source) url = `http://localhost:8080/data/source/${source}`;
                else if(city) url = `http://localhost:8080/data/city/${city}`;
                else if(country) url = `http://localhost:8080/data/country/${country}`;
                else url = `http://localhost:8080/data/`;
                
                const response = await fetch(url);
                const info = await response.json();
                setRecords(info);
                console.log(info);
            };
            fetchRecords();
        }, [ startYear, endYear, topic, sector, region, swot, pestle, source, city, country ]
    );

    if(!Array.isArray(records)){
        return <div className='CatalogPage'>
                  <div className='heading'>
                    <h1 className='noData'>⚠︎ Data Unavailable</h1>
                  </div>
                </div>
      }
    

    return (
        <div className='CatalogPage'>
            {records.map(record => <CatalogCard record={record}/>)}
        </div>
    );
}
  