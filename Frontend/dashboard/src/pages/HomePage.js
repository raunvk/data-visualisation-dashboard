import { React, useEffect, useState } from 'react';
import { HomeCard1 } from '../components/HomeCard1';
import { HomeCard2 } from '../components/HomeCard2';

import './HomePage.scss';

export const HomePage = () => {

    const [records, setRecords] = useState([]);

    useEffect(() => {
        const fetchRecords = async () => {
            const response = await fetch(`http://localhost:8080/data/filter/`);
            const info = await response.json();
            setRecords(info);
            console.log(info);
        };
    
        fetchRecords();
    }, []);
    
    return (
        <div className='HomePage'>
            <div className='headerSection'>
                <h1 className='appName'>◄ Data Visualization Dashboard ►</h1>
            </div>
            <div className='homeGrid'>
                <div>{records.map(record => <HomeCard1 record={record}/>)}</div>
                <div>{records.map(record => <HomeCard2 record={record}/>)}</div>
            </div>
        </div>
    );
}
  