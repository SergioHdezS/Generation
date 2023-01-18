import React, { useCallback, useState } from "react";
import { useNavigate } from "react-router-dom";
import { CarFormComponent, CarTable, SendButton } from "../components";
import { alpha, styled } from '@mui/material/styles';
import { pink } from '@mui/material/colors';
import Switch from '@mui/material/Switch';

const auto1 =[{
    id: 1,
    marca: 'Mazda',
    modelo: 'ALL-NEW MAZDA3 SPORT',
    color: 'Negro',
    valor: '$18.490.000',
    anio: 2023,
    },
    {
    id: 2,
    marca: 'Suzuki',
    modelo: 'SWIFT',
    color: 'Blanco',
    valor: '$10.690.000',
    anio: 2022,
    },
    {
    id: 3,
    marca: 'Hyundai',
    modelo: 'All-new ELANTRA',
    color: 'Azul',
    valor: '$17.990.000',
    anio: 2023,
    }];

const AutoPage = () => {
        const navigate = useNavigate();
        const handleOnClick = useCallback(() => navigate("/User", {}, [navigate]))
        const handleOnClickHome = useCallback(() => navigate("/", {}, [navigate]))
        const GreenSwitch = styled(Switch)(({ theme }) => ({
            '& .MuiSwitch-switchBase.Mui-checked': {
                color: pink[600],
                '&:hover': {
                backgroundColor: alpha(pink[600], theme.palette.action.hoverOpacity),
            },
            },
            '& .MuiSwitch-switchBase.Mui-checked + .MuiSwitch-track': {
                backgroundColor: pink[600],
            },
        }));
        const label = { inputProps: { 'aria-label': 'Color switch demo' } };

    const [state, setState] = useState(auto1);

    const autoDelete = (idAuto) => {
        const changeAuto = state.filter(auto => auto.id != idAuto)
        setState(changeAuto)
    }

    return (
        <div>
            <h1 class="text-center">Ingreso de Autos</h1>
            <div class="container">
                <div class="row">
                    <div class="col container border m-4 p-2">
                        <CarFormComponent/>
                        <div class="d-flex justify-content-center">
                            <SendButton infoButton={"Enviar"}/>
                        </div>
                    </div>
            </div>
            <SendButton infoButton={"Ir a usuarios"} handleOnClick={handleOnClick}/>
            <SendButton infoButton={"Ir al Inicio"} handleOnClick={handleOnClickHome}/>
            <Switch {...label} defaultChecked />
            <GreenSwitch {...label} defaultChecked />
            <h1 class="text-center">Vista de Autos</h1>
            <div class="container"></div>
                <div class="row">
                    <div class="col">
                        <CarTable autos={state} deleteAuto = {autoDelete}/>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default AutoPage;