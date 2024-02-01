import { React } from 'react';

import './MinorCard.scss';

export const MinorCard1 = ({data}) => {

  let region = data.region;
  let city = data.city;
  let country = data.country;
  let startYear = data.startYear;
  let endYear = data.endYear;
  let added = data.added;
  let published = data.published;

  if(!startYear) startYear = 'Data Unavailable';
  if(!endYear) endYear = 'Data Unavailable';
  if(!added) added = 'Data Unavailable';
  if(!published) published = 'Data Unavailable';
  if(!region) region = 'Data Unavailable';
  if(!city) city = 'Data Unavailable';
  if(!country) country = 'Data Unavailable';


  return (
    <div className='MinorCard1'>
      <h5 className='city'><span className='highlighter'>• PLACE&emsp;➟</span><span className='info'>&emsp;{city}, {country}</span></h5>
      <h5 className='region'><span className='highlighter'>• REGION&emsp;➟</span><span className='info'>&emsp;{region}</span></h5>
      <h5 className='years'><span className='highlighter'>• YEARS&emsp;➟</span><span className='info'>&emsp;{startYear} - {endYear}</span></h5>
      <h5 className='published'><span className='highlighter'>• POSTED&emsp;➟</span><span className='info'>&emsp;{published}</span></h5>
      <h5 className='added'><span className='highlighter'>• ADDED&emsp;➟</span><span className='info'>&emsp;{added}</span></h5>
    </div>
  );
}