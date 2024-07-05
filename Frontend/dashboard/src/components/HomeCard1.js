import { React } from 'react';
import { Link } from 'react-router-dom';

import './HomeCard.scss';

export const HomeCard1 = ({record}) => {

    const route = `/data/${record}`;

    let keyword = record.toUpperCase();

    return (
        <div className='homeCard'>
            <h1><span className='bullet'>🔍︎</span>&emsp;<Link to={route}><span className='record'>Filter Search by <span className='keyword'>{keyword}</span></span></Link></h1>
        </div>
    )

}
