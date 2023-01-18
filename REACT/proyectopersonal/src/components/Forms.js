import React, { useEffect, useState } from "react";

const CarFormComponent = () => {
    return (
        <div>
            <h3>Formulario Auto</h3>
            <form>
                <div class="mb-3">
                    <label for="formGroupExampleInput" class="form-label">Marca</label>
                    <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Ingrese la marca del auto" />
                </div>
                <div class="mb-3">
                    <label for="formGroupExampleInput2" class="form-label">Modelo</label>
                    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Ingrese el modelo del auto" />
                </div>
                <div class="mb-3">
                    <label for="formGroupExampleInput" class="form-label">Color</label>
                    <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Ingrese el color del auto" />
                </div>
                <div class="mb-3">
                    <label for="formGroupExampleInput2" class="form-label">Valor</label>
                    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Ingrese el valor del auto" />
                </div>
                <div class="mb-3">
                    <label for="formGroupExampleInput2" class="form-label">Año</label>
                    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Ingrese el año del auto" />
                </div>
            </form>
        </div>
    );
}

const initialUsuario = {
    name: "",
    lastName: "",
    correo: "",
    id: ""
}

const UserFormComponent = ({ userAdd, usuarioEditado, setUsuarioEditado, userEdit }) => {
    const [usuario, setUsuario] = useState(initialUsuario);
    const { name, lastName, correo, id } = usuario;
    //el hook useEffect siempre esta pendiente de si la variable que tiene dentro de
    //sus corchetes cambia el deberá hacer todo lo que tiene en su funcion dentro
    //CONSIDERACIÓN es que useEffect siempre corre al menos 1 vez cuando la página carga por primera vez
    useEffect(() => {
        if (usuarioEditado !== null) {
            setUsuario(usuarioEditado)
        } else {
            setUsuario({
                name: "",
                lastName: "",
                correo: "",
                id: "",
            }
            )
        }
    }, [usuarioEditado]);

    const handleInputChange = (e) => {
        //esta funcion se llama cada vez que nostros escribirmos algo en algun input de
        //nuestra página
        const changedFormValue = {
            //va a antaner los datos que tiene usuario de los input que no he tocado
            //pero va a aactualizar el atributo que cambié por su nuevo valor
            ...usuario,
            [e.target.name]: e.target.value
        }
        //finalmente los cambios deberán verse reflejados en neustro hook
        setUsuario(changedFormValue);
    }
    return (
        <div>
            <h3>Formulario Usuario</h3>
            <form>
                {/* hacemos que el mensaje del formulario sea dinamico
                segun si queremos editar o ingresar */}
                {usuarioEditado !== null ? <h1>Editar Usuario</h1> : <h1>Ingrese Usuario</h1>}
                <div class="mb-3">
                    <label for="formGroupExampleInput" class="form-label">Id</label>
                    //para que mi formulario sea capaz de crear un usuario debemos agregarle a los input
                    //lo siguente
                    <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Ingrese su ID" name="id" value={id} onChange={handleInputChange} />
                </div>
                <div class="mb-3">
                    <label for="formGroupExampleInput" class="form-label">Nombre</label>
                    <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Ingrese su nombre" name="name" value={name} onChange={handleInputChange} />
                </div>
                <div class="mb-3">
                    <label for="formGroupExampleInput2" class="form-label">Apellido</label>
                    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Ingrese su apellido" name="lastName" value={lastName} onChange={handleInputChange} />
                </div>
                <div class="mb-3">
                    <label for="formGroupExampleInput2" class="form-label">Correo</label>
                    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Ingrese su direccion de correo electronico" name="correo" value={correo} onChange={handleInputChange} />
                </div>
                {/*cambia el texto y funcion del boton si usuarioEditado es distinto de null o no, si es True toma la funcion y texto Editar
                si es false toma el texto y funcion guardar(set)*/}
                {usuarioEditado !== null ? (
                    <button
                        type="button"
                        class="btn btn-success"
                        onClick={() => userEdit(usuario)}
                    >
                        Editar usuario
                    </button>
                ) : (
                    <button
                        type="button"
                        class="btn btn-success"
                        onClick={() => userAdd(usuario)}
                    >
                        Ingresar usuario
                    </button>
                )}
                {usuarioEditado !== null ? <button
                        type="button"
                        class="btn btn-warning"
                        onClick={() => setUsuarioEditado(null)}
                    >
                        Cancelar
                    </button> : <></>}

            </form>
        </div>
    );
}
export { CarFormComponent, UserFormComponent };
