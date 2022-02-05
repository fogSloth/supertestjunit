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

public class put {
    private static String contentType = "application/json";
    public static FileSystem fileSystem = FileSystems.getDefault();
    private static String separator = fileSystem.getSeparator();
    public String jsonBody = "";
    public String uriResolved = "";

    private static String URL = "https://reqres.in/api/";

    private static String put = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "put.json";
	private static String put1 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "put1.json";
	private static String put2 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "put2.json";
	private static String put3 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "put3.json";
	private static String put4 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "put4.json";
	private static String put5 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "put5.json";
	
    
    public Response putPUT() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(put); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .put(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response putPUT1() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(put1); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .put(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response putPUT2() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(put2); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .put(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response putPUT3() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(put3); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .put(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response putPUT4() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(put4); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .put(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	public Response putPUT5() throws Exception {
        try{
			String queryParam = "users/2";
			jsonBody = Utils.generateJSONBody(put5); 
        uriResolved = URL + queryParam;
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .put(uriResolved);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
	
}