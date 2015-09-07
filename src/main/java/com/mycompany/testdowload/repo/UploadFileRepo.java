/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testdowload.repo;

import com.mycompany.testdowload.model.UploadFile;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author Jasin007
 */
public interface UploadFileRepo extends JpaRepository<UploadFile,Integer>{
    
}
