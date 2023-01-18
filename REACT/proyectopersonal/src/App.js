import React from "react";
import { BrowserRouter, Routes, Route} from "react-router-dom";
import { UserPage, AutoPage, HomePage } from "./pages";

const App = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<HomePage/>}/>
                <Route path="/User" element={<UserPage/>}/>
                <Route path="/Auto" element={<AutoPage/>}/>
            </Routes>
        </BrowserRouter>
    );
}

export default App;