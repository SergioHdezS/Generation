create schema if not exists miAutomotora;

create table `miAutomotora`.`cliente`(
`cliente_id` int not null auto_increment,
`nombreCliente` varchar(30) not null,
`rut` varchar(15) not null,
`correo` varchar(30) not null,
`telefono` varchar(12) not null,
primary key (cliente_id));

create table `miAutomotora`.`vendedor`(
`vendedor_id` int not null auto_increment,
`nombreVendedor` varchar(30) not null,
primary key (vendedor_id));

create table `miAutomotora`.`producto`(
`producto_id` int not null auto_increment,
`nombreProducto` varchar(30) not null,
`precio` int not null,
`tipoProducto` varchar(15) not null,
`marca` varchar(15) not null,
`modelo` varchar (15) not null,
`color` varchar (15) not null,
primary key (producto_id));

create table `miAutomotora`.`orden`(
`orden_id` int not null auto_increment,
`financiamiento` varchar(15) not null,
`fecha` date not null,
primary key (orden_id));

create table `miAutomotora`.`historial`(
`historial_id` int not null auto_increment,
primary key (historial_id)); 

#agregar a tabla `orden` cliente_id como foreign key
alter table miautomotora.orden add cliente_id int not null;
alter table miautomotora.orden add constraint ordenCliente foreign key (cliente_id) references miautomotora.cliente(cliente_id);

#agregar a tabla `orden` vendedor_id
alter table miautomotora.orden add vendedor_id int not null;
alter table miautomotora.orden add constraint ordenVendedor foreign key (vendedor_id) references miautomotora.vendedor(vendedor_id);

#agregar a tabla `orden` producto_id
alter table miautomotora.orden add producto_id int not null;
alter table miautomotora.orden add constraint ordenProducto foreign key (producto_id) references miautomotora.producto(producto_id);

#agregar a tabla `historial` orden_id
alter table miautomotora.historial add orden_id int not null;
alter table miautomotora.historial add constraint historialOrden foreign key (orden_id) references miautomotora.orden(orden_id);

#agregar datos
insert into miautomotora.cliente (nombreCliente, rut, correo, telefono) values ('Arturo Vidal', '17.547.365-4', 'arturocrack@correo.com', '+56987989847');

insert into miautomotora.vendedor (nombreVendedor) values ('Sergio Hernandez');

insert into miautomotora.producto (nombreProducto, precio, tipoProducto, marca, modelo, color) values ('Aventador', 80000000, 'Automovil', 'Lamborghini', 'LP780-4ULTIMAE', 'Gris');
insert into miautomotora.producto (nombreProducto, precio, tipoProducto, marca, modelo, color) values ('Huracan', 80000000, 'Automovil', 'Lamborghini', 'Tecnica', 'Verde');

insert into miautomotora.orden (financiamiento, fecha, cliente_id, vendedor_id, producto_id) values ('Contado', '2022-06-08', 1, 1, 1);
insert into miautomotora.orden (financiamiento, fecha, cliente_id, vendedor_id, producto_id) values ('Contado', '2022-06-08', 1, 1, 2);

insert into miautomotora.historial (orden_id) values (1);
insert into miautomotora.historial (orden_id) values (2);