package com.hid.calculator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@GetMapping("add")
	public ResponseEntity<?> addition(@RequestParam("firstNumber") Long a, @RequestParam("secondNumber") Long b){
		
		return ResponseEntity.ok(new Result(a + b));
		
		
	}
	@GetMapping("sub")
	public ResponseEntity<?> substraction(@RequestParam("firstNumber") Long a, @RequestParam("secondNumber") Long b){
		
		return ResponseEntity.ok(new Result(a - b));
		
		
	}
	@GetMapping("multiply")
	public ResponseEntity<?> multiply(@RequestParam("firstNumber") Long a, @RequestParam("secondNumber") Long b){
		
		return ResponseEntity.ok(new Result(a * b));
		
		
	}
	@GetMapping("divide")
	public ResponseEntity<?> division(@RequestParam("firstNumber") Long a, @RequestParam("secondNumber") Long b){
		
		return ResponseEntity.ok(new Result(a / b));
		
		
	}



}
