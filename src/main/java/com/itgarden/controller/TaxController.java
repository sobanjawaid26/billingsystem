package com.itgarden.controller;

import com.itgarden.dto.TaxInfo;
import com.itgarden.messages.ResponseMessage;
import com.itgarden.service.bo.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/private/taxes")
public class TaxController {

    @Autowired
    private TaxService taxService;

    @PostMapping
    public ResponseEntity<ResponseMessage<?>> save(@RequestBody TaxInfo taxInfo) {
        ResponseMessage responseMessage  = taxService.save(taxInfo);
        return new ResponseEntity<ResponseMessage<?>>(responseMessage, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseMessage<?>> get(@PathVariable String id) throws Exception {
        ResponseMessage responseMessage = taxService.findResourceById(id);
        return new ResponseEntity<ResponseMessage<?>>(responseMessage, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<ResponseMessage<?>> getAll() throws Exception {
        ResponseMessage responseMessage = taxService.findAll();
        return new ResponseEntity<ResponseMessage<?>>(responseMessage, HttpStatus.OK);
    }
}
