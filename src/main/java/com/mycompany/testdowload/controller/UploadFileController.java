/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testdowload.controller;

import com.mycompany.testdowload.model.UploadFile;
import com.mycompany.testdowload.repo.UploadFileRepo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartRequest;

@Controller
public class UploadFileController {

//    @Autowired
//    private UploadFileRepo uploadFileRepo;
//
//    @RequestMapping(value = "/savefile", method = RequestMethod.POST)
//    @ResponseBody
//    public void saveFile(MultipartRequest file) throws IOException {
//        System.out.println("----------------------------------->"+file.getMultiFileMap());
//        UploadFile uploadFile = new UploadFile();
//        uploadFile.setName(file.getFile("file").getOriginalFilename());
//        uploadFile.setMimeType(file.getFile("file").getContentType());
//        uploadFile.setContent(file.getFile("file").getBytes());
//        uploadFileRepo.save(uploadFile);
//    }
//
//    @RequestMapping(value = "/getfile/{id}", method = RequestMethod.GET)
//    public ResponseEntity<InputStreamResource> getFile(@PathVariable("id") UploadFile uploadFile) {
//        ResponseEntity<InputStreamResource> body = ResponseEntity.ok().contentLength(uploadFile.getContent().length)
//                .contentType(MediaType.parseMediaType(uploadFile.getMimeType()))
//                .header("Content-Disposition", "attachment; filename=\"" + uploadFile.getName() + "\"")
//                .body(new InputStreamResource(new ByteArrayInputStream(uploadFile.getContent())));
//        return body;
//    }
}
