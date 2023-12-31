package com.spring.spring;

import com.spring.spring.comercial.ComercialExperimentado;
import com.spring.spring.empleados.Director;
import com.spring.spring.empleados.Empleado;
import com.spring.spring.empleados.Maestro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IoCApplication {

	//Aplicacion ejemplo de spring inversion de control(IoC) e inyeccion de dependencias
	//Con archivo de configuracion(contexto de spring) en xml y en codigo java
	/* 	Pasos para iniciar el contexto de spring
		1. Abrir el archivo de configuracion
			XML:
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //Abro el contenedor xml
			Archivo java:
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class); //Abro la clase de configuracion definida
		2. Pedir los beans
			Empleado empleado = context.getBean("empleado", Empleado.class);
		3. Cerrar archivo de configuracion
			context.close();

		Anotaciones usadas
		@Autowired para inyeccion de dependencias en constructor, setter y campos de clase
		@Qualifier("") resuelve ambiguedades en interfaces con multiples implementaciones, usar con autowired
		@Configuration para definir el contexto de spring como una clase
		@ComponentScan("") para escanear un paquete en busca de beans
		@PropertySource("") para enlazar archivo de propiedades externo
		@Bean para definir un bean en un metodo que retorne la clase del bean, el nombre del metodo debe ser igual a la clase que retorna pero primera letra minuscula
		@Component("") para definir un bean y su ID, debe ser leido por el archivo de configuracion
		@Value(${}) para traer propiedades de un archivo externo definido en el contexto con PropertySource
	 	@PostConstruct para definir el metodo init del bean
	 	@PreDestroy	para definir el metodo destroy del bean
	 	@Scope("singleton"||"prototype") patron de creacion de los beans, por defecto usa singleton
	 */
	public static void main(String[] args) {
		//IoC inversion de control
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //Abro el contenedor xml
		//Empleado e = context.getBean("maestro", Empleado.class); //Obtengo el bean por id
		//e.getTareas(); //Uso de la clase
		//context.close(); //Cerrar la conexion

		/*/Inyeccion de dependencias
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleado empleado = context.getBean("conserje",Empleado.class);
		Empleado empleado1 = context.getBean("conserje", Empleado.class);

		System.out.println(empleado.getInforme());
		System.out.println(empleado.hashCode());
		System.out.println(empleado1.hashCode());
		context.close();*/

		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Maestro maestro = context.getBean("maestro", Maestro.class);
		System.out.println(maestro.getMateria());
		context.close();*/

		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleado empleado = context.getBean("director",Empleado.class);
		System.out.println(empleado.getInforme());
		//context.close(); */

		//Configuracion xml
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnotations.xml");
		//Configuracion codigo java, lleva de parametro la clase del archivo config
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ComercialExperimentado comercial = context.getBean("comercialExperimentado", ComercialExperimentado.class);
		Empleado e = context.getBean("director", Empleado.class);

		System.out.println(e.getInforme());

		context.close();*/

		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Director empleado = context.getBean("director", Director.class);
		System.out.println(empleado.getEmail());
		System.out.println(empleado.getNombre());

		context.close();*/


	}

}
