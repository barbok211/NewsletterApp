/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.mtp.i4.c22016.beans;

import fr.epsi.mtp.i4.c22016.models.Receiver;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.json.JsonArray;
import javax.json.JsonString;
import javax.json.JsonValue;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author mehdi <your.name at your.org>
 */

@ManagedBean
@SessionScoped
public class ReceiverController {
    public List<Receiver> getAllReceiver() {
   List<Receiver> receivers = new ArrayList<>();
   Client client = ClientBuilder.newClient();
   WebTarget target = client.target("http://localhost:8080/sticker-story-rest-server/rest/stickers");
   JsonArray response = target.request(MediaType.APPLICATION_JSON).get(JsonArray.class);
   for (JsonValue receiver : response) {
      //receivers.add(((JsonString) receiver).getString());  
   }
   return receivers;
}
}
