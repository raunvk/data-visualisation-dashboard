import { React } from 'react';
import { Link } from 'react-router-dom';

import './FilterCard.scss';

export const FilterCard = ({record, filter}) => {

    const route = `/data/${filter}/${record}`;

    return (
        <div className='filterCard'>
            <h1><span className='bullet'>•</span> <Link to={route}><span className='record'>{record}</span></Link></h1>
        </div>
    )

}