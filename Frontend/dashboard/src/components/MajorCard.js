import { React } from 'react';

import './MajorCard.scss';

export const MajorCard = ({data}) => {
    
  let title = data.title;
  let topic = data.topic;
  let sector = data.sector;
  let pestle = data.pestle;
  let swot = data.swot;
  let source = data.source;

  if(!title) title = 'Data Unavailable';
  if(!topic) topic = 'Data Unavailable';
  if(!sector) sector = 'Data Unavailable';
  if(!pestle) pestle = 'Data Unavailable';
  if(!swot) swot = 'Data Unavailable';
  if(!source) source = 'Data Unavailable';

  return (
    <div className='MajorCard'>
      <div className='otherDiv'>
        <h3 className='topic'><span className='highlighter'>• TOPIC&emsp;➟</span>&emsp;{topic}</h3>
        <h3 className='sector'><span className='highlighter'>• SECTOR&emsp;➟</span>&emsp;{sector}</h3>
        <h3 className='pestle'><span className='highlighter'>• PESTLE&emsp;➟</span>&emsp;{pestle}</h3>
        <h3 className='swot'><span className='highlighter'>• SWOT&emsp;➟</span>&emsp;{swot}</h3>
        <h3 className='source'><span className='highlighter'>• SOURCE&emsp;➟</span>&emsp;{source}</h3>
      </div>
      <div className='titleDiv'>
        <h3 className='title'>"{title}"</h3><br/>
      </div>
    </div>
  );
}