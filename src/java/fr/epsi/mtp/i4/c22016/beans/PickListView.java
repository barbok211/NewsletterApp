/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.mtp.i4.c22016.beans;

import fr.epsi.mtp.i4.c22016.models.Receiver;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
 
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;

@Named(value = "receiverPickListView")
@ManagedBean
@SessionScoped
public class PickListView {
          
    private DualListModel<Receiver> receivers;
     
    @PostConstruct
    public void init() {
        //users
        List<Receiver> receiverSource = new ArrayList<Receiver>();
        List<Receiver> receiverTarget = new ArrayList<Receiver>();
         
        //receiverSource.add();
     /*    public List<String> getAllStickers() {
   List<String> allStickers = new ArrayList<>();
   Client client = ClientBuilder.newClient();
   WebTarget target = client.target("http://localhost:8080/sticker-story-rest-server/rest/stickers");
   JsonArray response = target.request(MediaType.APPLICATION_JSON).get(JsonArray.class);
   for (JsonValue sticker : response) {
      allStickers.add(((JsonString) sticker).getString());  
   }
   return allStickers;
}*/
        receivers = new DualListModel<>(receiverSource, receiverTarget);
         
    }
 
    public DualListModel<Receiver> getReceivers() {
        return receivers;
    }
 
    public void setReceivers(DualListModel<Receiver> receivers) {
        this.receivers = receivers;
    }
 
 
    public void onSelect(SelectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", event.getObject().toString()));
    }
     
    public void onUnselect(UnselectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Unselected", event.getObject().toString()));
    }
     
    public void onReorder() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "List Reordered", null));
    } 
}
