package com.curso.escuela.BicicletaStore;

import org.springframework.stereotype.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BController {
	
	@Autowired
	BiciRepository BRepo;
	
	//PostMapping es para agregar/Crear
	@RequestMapping(value="/bicicleta",method= RequestMethod.GET) //es igual al GetMapping pero hay que especificar
	@ResponseBody  //siempre es necesario
	public Bicicleta getBicicleta() {
		Bicicleta b1 =new Bicicleta();
		b1.setId(12L);
		b1.setMarca("una marca");
		b1.setModelo("unModelo");
		b1.setPrecio(10000L);
		return b1;
		}
	
	@RequestMapping(value="/bicicleta/{id}",method= RequestMethod.GET)
	@ResponseBody
	public Optional<Bicicleta> getBicicletaById(@PathVariable Long id){
		return BRepo.findById(id);
	}

}
