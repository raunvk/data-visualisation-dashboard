import './App.scss';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { DataPage } from './pages/DataPage';
import { CatalogPage } from './pages/CatalogPage';
import { FilterPage } from './pages/FilterPage';
import { HomePage } from './pages/HomePage';
import { ChartPage } from './pages/ChartPage';

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/" element={<HomePage/>}/>
          <Route path="/data/chart/:filter/" element={<ChartPage/>}/>
          <Route path="/data/:filter" element={<FilterPage/>}/>
          <Route path="/data/" element={<CatalogPage/>}/>
          <Route path="/data/id/:entryId" element={<DataPage/>}/>
          <Route path="/data/topic/:topic" element={<CatalogPage/>}/>
          <Route path="/data/startyear/:startYear" element={<CatalogPage/>}/>
          <Route path="/data/endyear/:endYear" element={<CatalogPage/>}/>
          <Route path="/data/sector/:sector" element={<CatalogPage/>}/>
          <Route path="/data/region/:region" element={<CatalogPage/>}/>
          <Route path="/data/swot/:swot" element={<CatalogPage/>}/>
          <Route path="/data/pestle/:pestle" element={<CatalogPage/>}/>
          <Route path="/data/source/:source" element={<CatalogPage/>}/>
          <Route path="/data/city/:city" element={<CatalogPage/>}/>
          <Route path="/data/country/:country" element={<CatalogPage/>}/>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
