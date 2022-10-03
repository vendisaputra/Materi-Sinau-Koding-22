package com.sinaukoding.tokosinau.controller;

import com.sinaukoding.tokosinau.common.Response;
import com.sinaukoding.tokosinau.entity.dto.PembayaranDTO;
import com.sinaukoding.tokosinau.entity.dto.ProductDTO;
import com.sinaukoding.tokosinau.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductServiceImpl service;

    @GetMapping("/find-all")
    public Response findAllData(){
        List<ProductDTO> data = service.findAllData();
        return new Response(data, "Get All Data Pembayaran", data.size(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public Response saveData(@RequestBody ProductDTO param){
        if (service.save(param) == null){
            return new Response("Data Pembeli tidak ditemukan", HttpStatus.BAD_REQUEST);
        }
        return new Response(service.save(param), "Data Berhasil di tambahkan", HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateData(@PathVariable Long id,
                                        @RequestBody ProductDTO param){
        ProductDTO data = service.update(param, id);

        if (data != null) {
            return new ResponseEntity<>(data, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }

    @GetMapping("/find-by-id/{id}")
    public Response findById(@PathVariable Long id){
        return new Response(service.findById(id), "Berhasil Mengabil Data dari id " + id, HttpStatus.OK);
    }

    @GetMapping("/find-by-id")
    public ResponseEntity<?> findById2(@RequestParam(name = "id") Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public Response deleteData(@PathVariable Long id){
        if (service.delete(id)){
            return new Response("Data Berhasil di Hapus",HttpStatus.OK);
        }else{
            return new Response("Data Gagal di Hapus",HttpStatus.BAD_REQUEST);
        }


    }
}
