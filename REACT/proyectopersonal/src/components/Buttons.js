import React from "react";

const SendButton = ({infoButton, handleOnClick}) => {
    return (
        <button 
        type="button" 
        class="btn btn-primary"
        onClick={()=>{
            handleOnClick();
        }}
        >{infoButton}</button>
    );
}
export default SendButton;