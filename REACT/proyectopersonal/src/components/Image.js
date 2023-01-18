import React from "react";

const HomePageImage = ({children}) => {
    return (
        <div style={{
            display: "flex",
            backgroundImage: `url(${process.env.PUBLIC_URL + '/fondoPaginaHome.jpg'})`,
            minHeight:'100vh',
            backgroundSize: "cover",
        
        }}>
            {children}
        </div>
    );
}

export default HomePageImage;