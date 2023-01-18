import React, { useCallback } from "react";
import { useNavigate } from "react-router-dom";
import { SendButton, HomePageImage } from "../components";

const HomePage = () => {
        const navigate = useNavigate(); 
        const handleOnClickAuto = useCallback(() => navigate("/Auto", {}, [navigate]));
        const handleOnClickUsers = useCallback(() => navigate("/User", {}, [navigate])); 
    return (
        <HomePageImage>
            <div class="container bg-dark opacity-70 w-25 h-25 align-middle">
                <SendButton infoButton={"Ir a autos"}  handleOnClick={handleOnClickAuto} />
                <SendButton infoButton={"Ir a usuarios"}  handleOnClick={handleOnClickUsers} />
            </div>
        </HomePageImage>

    );
}

export default HomePage;