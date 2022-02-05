package com.dedalow.request;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.HashMap;
import com.aventstack.extentreports.Status;
import java.io.IOException;
import com.dedalow.utils.Utils;
import com.dedalow.report.Report;

public class patch {
    private static String contentType = "application/json";
    public static FileSystem fileSystem = FileSystems.getDefault();
    private static String separator = fileSystem.getSeparator();
    public String jsonBody = "";
    public String uriResolved = "";

    private static String URL = "https://reqres.in/api/";

    private static String patch = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "patch.json";
	private static String patch1 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "patch1.json";
	private static String patch2 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "patch2.json";
	private static String patch3 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "patch3.json";
	private static String patch4 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "patch4.json";
	private static String patch5 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "patch5.json";
	
    
    public Response patchPATCH() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(patch); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .patch(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response patchPATCH1() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(patch1); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .patch(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response patchPATCH2() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(patch2); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .patch(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response patchPATCH3() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(patch3); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .patch(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response patchPATCH4() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(patch4); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .patch(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response patchPATCH5() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(patch5); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .patch(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	
}