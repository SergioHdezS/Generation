import React from "react";
import { BrowserRouter, Routes, Route} from "react-router-dom";
import { HomePage } from "./pages";

const App = () =>{
    return(
        //desde el navegador
        <BrowserRouter>
            {/*vamos a tener distintas rutas*/}
            <Routes>
                {/*especificamos cadad ruta*/}
                <Route path="/" element={<HomePage/>}/>
            </Routes>
        </BrowserRouter>
    );
}

export default App;