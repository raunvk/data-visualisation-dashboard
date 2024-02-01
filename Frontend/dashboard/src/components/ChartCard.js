import React, { useEffect, useRef } from 'react';
import Chart from 'chart.js/auto';

import './ChartCard.scss';

export const ChartCard = ({ records }) => {
  const chartRef = useRef(null);

  useEffect(() => {
    const keys = records.map(entry => entry.key);
    const values = records.map(entry => entry.value);

    const ctx = chartRef.current.getContext('2d');
    const chart = new Chart(ctx, {
      type: 'bar',
      data: {
        labels: keys,
        datasets: [{
          label: 'Values',
          data: values,
          backgroundColor: 'rgba(181, 254, 131, 1)', // Set your desired color
          borderColor: 'rgba(181, 254, 131, 1)',     // Set your desired color
          borderWidth: 1,
        }],
      },
      options: {
        scales: {
          y: {
            beginAtZero: true,
          },
        },
        plugins: {
          legend: {
            labels: {
              font: {
                family: 'Quicksand, sans-serif', // Specific or generic font family
                size: 15, // Set your desired font size
                style: 'normal', // 'normal', 'italic', 'oblique'
                color: 'rgba(255, 255, 255, 1)', // Set your desired color
              },
            },
          },
        },
      },
    });
    return () => {
      chart.destroy();
    };
  }, [records]);

  return (
    <div className='ChartCard'>
      <canvas ref={chartRef}></canvas>
    </div>
  );
};
