package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.CharacterBDO;
import com.example.demo.pojo.ExceptionType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/bdo")
@Api(value = "/", consumes = "application/json")
public class DemoController {

    @ApiOperation(value = "Retrieve list of characters", nickname = "getCharacterBDO", notes = "", response = CharacterBDO.class, responseContainer = "List", tags = {
	    "products" })
    @ApiResponses(value = {
	    @ApiResponse(code = 200, message = "List of product instances provided", response = CharacterBDO.class, responseContainer = "List"),
	    @ApiResponse(code = 400, message = "Bad Request", response = ExceptionType.class),
	    @ApiResponse(code = 500, message = "Internal Server Error", response = ExceptionType.class),
	    @ApiResponse(code = 404, message = "Not Found", response = ExceptionType.class) })
    @GetMapping(produces = { "application/json" })
    public CharacterBDO getCharacterBDO(String id, String name, String classname, Integer level) {
	CharacterBDO character = new CharacterBDO();
	character.setId(id);
	character.setName("Jhon");
	character.setClassname(classname);
	character.setLevel(level);
	return character;
    }

}
