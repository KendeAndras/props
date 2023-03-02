 /*
* File: RestApi.java
* Author: KorcsmarosKendeAndras
* Copyright: 2023 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2023-03-03
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/

package models;

public class RestApi {

    public RestApi() {
    }

    public String getProperties() {        
        HttpClient http = new HttpClient();        
        String host = "http://[::1]:3000/";
        String endpoint = "properties";
        String urlStr = host + endpoint;        
        String res = http.get(urlStr);
        return res;
    }
    
}
