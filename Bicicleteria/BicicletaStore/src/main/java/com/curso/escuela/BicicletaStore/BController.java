package com.curso.escuela.BicicletaStore;

import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class BController {
	
	@Autowired
	BiciRepository BRepo;
	
	//PostMapping es para agregar/Crear
	//GetMapping es para traer
	@RequestMapping(value="/bicicletas",method= RequestMethod.GET) //es igual al GetMapping pero hay que especificar
	@ResponseBody  //siempre es necesario
	public Bicicleta getBicicleta() 
		{
		Bicicleta b1 =new Bicicleta();
		b1.setId(12L);
		b1.setMarca("una marca");
		b1.setModelo("unModelo");
		b1.setPrecio(10000L);
		return b1;
		}
	
	@RequestMapping(value="/bicicletas/{id}",method= RequestMethod.GET)
	@ResponseBody
	public List<Bicicleta> getBicicletaById(@PathVariable Long id)
	{
		return BRepo.getByid(id);
	}
	
	@RequestMapping(value="/bicicletas/all",method= RequestMethod.GET)
	@ResponseBody
    public List<Bicicleta> getAllBicicleta() {
        return BRepo.findAll();
    }
	
	@RequestMapping(value="/bicicletas/buscar/{modelo}",method= RequestMethod.GET)
    public List<Bicicleta> getBiciByModelo(@PathVariable String modelo) {
        return BRepo.findAllByModeloLike(modelo);
    }
	
	@RequestMapping(value="/bicicletas/add", method= RequestMethod.POST)
    public Bicicleta createBici(Bicicleta bici) {
        return BRepo.save(bici);
    }
	/*
	@RequestMapping(value="/Rbicicleta/all",method= RequestMethod.GET)
	public RequestEntity<?> getAll(){
		List<Bicicleta> List = BRepo.findAll();	
			if(List.isEmpty()) {
			return new ResponseEntity("ERROR",HttpStatus.BAD_REQUEST);
			}else {
				return new ResponseEntity(List, HttpStatus.OK);
			}
			
			
		}
	*/
	
}
