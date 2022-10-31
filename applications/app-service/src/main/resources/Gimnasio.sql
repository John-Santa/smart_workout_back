create database smartworkout
Use smartworkout


create table persona
(
    id_persona nvarchar(10) primary key not null,
	nombre nvarchar(50) not null,
	apellido nvarchar(50) not null,
	genero nvarchar(10) not null,
	email nvarchar(50) not null,
	fecha_nacimiento date not null,
	estatura int not null,
	peso int not null
)

--Saca error porq aun no existe ninguna tabla
create table cliente
(
    id_cliente nvarchar(10)primary key not null,      
    objetivo nvarchar(100) not null,
	frecuencia int not null,
	id_persona_cliente nvarchar(10) foreign key references persona(id_persona) not null
)

create table nutricionista
(    
    id_nutricionista nvarchar(10)primary key not null,
    estado bit not null,
	sede nvarchar(50) not null,
	horario date not null,
	id_persona_nutricionista nvarchar(10) foreign key references persona(id_persona) not null
)

create table entrenador
(
    id_entrenador nvarchar(10)primary key not null,
    horario date not null,
	sede nvarchar(50) not null,
	estado bit not null,
	evento nvarchar(30) not null,
	id_persona_entrenador nvarchar(10) foreign key references persona(id_persona) not null
)

create table rutina_entrenamiento
(
    objetivo nvarchar(100) not null,
	sesion nvarchar(50) not null,
	nombre nvarchar(50) not null,
	repeticiones int not null,
	tiempo_ejecucion time not null,
	descanso_entre_series time not null,
	peso int not null,
	observaciones nvarchar not null,
    id_entrenador nvarchar(10) foreign key references entrenador(id_entrenador) not null,
    id_cliente nvarchar(10) foreign key references cliente(id_cliente) not null
)

create table plan_nutricional
(
    id_plan_nutricional nvarchar(10) primary key not null,
    objetivo_nutricional nvarchar(100) not null,
	kilo_calorias float not null,
	recomendaciones nvarchar(100) not null,
    id_nutricionista nvarchar(10) foreign key references nutricionista(id_nutricionista) not null,
	id_cliente nvarchar(10) foreign key references cliente(id_cliente) not null,

	/*TODO: Revizar relaciones*/
    id_valoracion_nutricional nvarchar(10) foreign key references valoracion_nutricional(id_valoracion_nutricional) not null,
    id_alimento nvarchar(10) foreign key references alimento(id_alimento) not null,
    id_distribucion_comida nvarchar(10) foreign key references distribucion_comida(id_distribucion_comida) not null
)

create table valoracion_nutricional
(
    id_valoracion_nutricional nvarchar(10) primary key not null,
    fecha date not null,
	abdomen float not null,
	midaxilar float not null,
	muslo float not null,
	pecho float not null,
	subescapular float not null,
	supraliaco Float not null,
	triceps float not null,
	brazo_relajado float not null,
	brazo_contraido float not null,
	cintura float not null,
	cadera float not null,
	perimetro_muslo float not null,
	pierna float not null,
	diagnostico nvarchar(100) not null
)

create table alimento
(
    id_alimento nvarchar(10) primary key not null,
    nombre nvarchar(50) not null,
	porcion_casera nvarchar(50) not null,
	porcion_gramo nvarchar(50) not null,
	aporte nvarchar(50) not null
)

create table distribucion_comida
(
    id_distribucion_comida nvarchar(10) primary key not null,
    horario date not null,
	carbohidrato int not null,
	proteina int not null,
	grasa int not null,
	vegetal int not null,
	bebida nvarchar(30) not null,
	requerimiento_agua float not null
)