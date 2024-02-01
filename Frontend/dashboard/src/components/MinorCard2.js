import React from 'react';
import { Pie } from 'react-chartjs-2';
import 'chart.js/auto'; // Import the auto bundle
import './MinorCard.scss';

export const MinorCard2 = ({ data }) => {

  let intensity = data.intensity || 0;
  let impact = data.impact || 0;
  let relevance = data.relevance || 0;
  let likelihood = data.likelihood || 0;

  let intensityLabel = 'INTENSITY (' + intensity + ')';
  let impactLabel = 'IMPACT (' + impact + ')';
  let relevanceLabel = 'RELEVANCE (' + relevance + ')';
  let likelihoodLabel = 'LIKELIHOOD (' + likelihood + ')';

  if(intensity===0){intensityLabel = 'INTENSITY (N.A.)';}
  if(impact===0){impactLabel = 'IMPACT (N.A.)';}
  if(relevance===0){relevanceLabel = 'RELEVANCE (N.A.)';}
  if(likelihood===0){likelihoodLabel = 'LIKELIHOOD (N.A.)';}

  const pieChartData = {
    labels: [relevanceLabel, impactLabel, intensityLabel, likelihoodLabel],
    datasets: [
      {
        data: [relevance, impact, intensity, likelihood],
        backgroundColor: [
          'rgba(253, 138, 138, 1)',
          'rgba(133, 244, 255, 1)',
          'rgba(254, 255, 134, 1)',
          'rgba(181, 254, 131, 1)',
        ],
        borderColor: [
          'rgba(253, 138, 138, 1)',
          'rgba(133, 244, 255, 1)',
          'rgba(254, 255, 134, 1)',
          'rgba(181, 254, 131, 1)',
        ],
        borderWidth: 1,
      },
    ],
  };

  const options = {
    plugins: {
      legend: {
        display: true,
        position: 'left',
        align: 'start', // 'start', 'center', or 'end'
        labels: {
          color: 'rgba(255, 255, 255, 1)', // Legend label color
          font: {
            size: 25, // Legend label font size
            family: 'Quicksand, sans-serif',
            style: 'normal', // Font style: normal, italic, or oblique
            weight: 'bold', // Font weight: normal, bold, bolder, lighter, or numeric value
          },
          padding: 30, // Padding between legend items
          boxWidth: 40, // Width of the colored box next to legend items
        },
      },
    },
    maintainAspectRatio: false,
    responsive: true,
  };

  return (
    <div className="MinorCard2" style={{ width: '600px', height: '250px' }}>
      <Pie data={pieChartData} options={options} />
    </div>
  );
};
