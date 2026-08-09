import { useRef } from "react";
import { gsap } from "gsap";
import { useGSAP } from "@gsap/react";
import { Route, Routes } from "react-router-dom";
import Home from './components/page1/Home'
import Howraceworks from "./components/navbar-page/howraceworks/Howraceworks";
import Howscoringworks from "./components/navbar-page/howscoringworks/Howscoringworks";
import Whotoknow from "./components/navbar-page/whotoknow/Whotoknow";
import Glossary from "./components/navbar-page/glossary/Glossary"

gsap.registerPlugin(useGSAP);

const App = () => {
  return (
    <div>
     <Routes>
        <Route path='/' element={<Home />}/>
        <Route path='/howraceworks' element={<Howraceworks/>}/>
        <Route path='/howscoringworks' element={<Howscoringworks />}/>
        <Route path='/whotoknow' element={<Whotoknow />}/>
        <Route path='/glossary' element={<Glossary />}/>
     </Routes>
    </div>
  );
};

export default App;
