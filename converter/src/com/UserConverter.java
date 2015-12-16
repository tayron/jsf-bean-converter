package com;
 
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
 
@FacesConverter(value="userConverter")
public class UserConverter implements Converter {
 
    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        UserMB userMB = (UserMB) context.getELContext().getELResolver().getValue(context.getELContext(), null, "userMB");
 
        return userMB.getUserByName(key);
    }
 
    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        return arg2.toString();
    }
}