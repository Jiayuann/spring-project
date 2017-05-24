/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

/**
 *
 * @author jiayuan
 */
import java.io.*;
import java.util.UUID;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
public class UploadAction {
    File doc;
    String docFileName;
    String docContentType;
    public String upload() {
        System.out.println(doc);
        System.out.println(docFileName);
        System.out.println(docContentType);
        return "success";
    }
     public File getDoc() {
        return doc;
    }
 
    public void setDoc(File doc) {
        this.doc = doc;
    }
 
    public String getDocFileName() {
        return docFileName;
    }
 
    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }
 
    public String getDocContentType() {
        return docContentType;
    }
 
    public void setDocContentType(String docContentType) {
        this.docContentType = docContentType;
    }
    
    
}
