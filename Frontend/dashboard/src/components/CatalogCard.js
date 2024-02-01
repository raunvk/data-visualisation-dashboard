import { React } from 'react';
import { Link } from 'react-router-dom';

import './CatalogCard.scss';

export const CatalogCard = ({record}) => {

  let insight = record.insight;
  let url = record.url;
  let title = record.title;
  let topic = record.topic;
  let sector = record.sector;
  let pestle = record.pestle;
  let swot = record.swot;
  let source = record.source;
  let startYear = record.startYear;
  let endYear = record.endYear;
  let city = record.city;
  let country = record.country;
  let region = record.region;

  if(!insight) insight = 'Data Unavailable';
  if(!title) title = 'Data Unavailable';
  if(!topic) topic = 'Data Unavailable';
  if(!sector) sector = 'Data Unavailable';
  if(!pestle) pestle = 'Data Unavailable';
  if(!swot) swot = 'Data Unavailable';
  if(!startYear) startYear = 'Data Unavailable';
  if(!endYear) endYear = 'Data Unavailable';
  if(!source) source = 'Data Unavailable';
  if(!city) city = 'Data Unavailable';
  if(!country) country = 'Data Unavailable';
  if(!region) region = 'Data Unavailable';

  const entryId = record.entryId;
  const dataPageRoute = `/data/id/${entryId}`;

  return (
    <div className='CatalogCard'>
      <div className='headingDiv'>
        <h1>➤<Link to={dataPageRoute}> {insight}</Link></h1>
      </div>
      <div className='gridDiv'>
        <div className='otherDiv'>
          <h3><span className='highlighter'>• TOPIC&emsp;➟</span><span className='info'>&emsp;{topic}</span></h3>
          <h3><span className='highlighter'>• SECTOR&emsp;➟</span><span className='info'>&emsp;{sector}</span></h3>
          <h3><span className='highlighter'>• PESTLE&emsp;➟</span><span className='info'>&emsp;{pestle}</span></h3>
          <h3><span className='highlighter'>• SWOT&emsp;➟</span><span className='info'>&emsp;{swot}</span></h3>
          <h3><span className='highlighter'>• SOURCE&emsp;➟</span><span className='info'>&emsp;{source}</span></h3>
          <h3><span className='highlighter'>• PLACE&emsp;➟</span><span className='info'>&emsp;{city} - {country}</span></h3>
          <h3><span className='highlighter'>• REGION&emsp;➟</span><span className='info'>&emsp;{region}</span></h3>
          <h3><span className='highlighter'>• YEARS&emsp;➟</span><span className='info'>&emsp;{startYear} - {endYear}</span></h3>
        </div>
        <div className='subHeadingDiv'>
          <h3>"{title}"</h3>
        </div>
      </div>
    </div>
  );
}