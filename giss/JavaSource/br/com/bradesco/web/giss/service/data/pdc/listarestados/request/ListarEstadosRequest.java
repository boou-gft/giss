/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarEstadosRequest.java,v 1.1 2017/12/06 19:51:55 gabrielmarani Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarestados.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarEstadosRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/12/06 19:51:55 $
 */
public class ListarEstadosRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listaEstados
     */
    private br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListaEstados _listaEstados;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarEstadosRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListarEstadosRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'listaEstados'.
     * 
     * @return ListaEstados
     * @return the value of field 'listaEstados'.
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListaEstados getListaEstados()
    {
        return this._listaEstados;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListaEstados getListaEstados() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'listaEstados'.
     * 
     * @param listaEstados the value of field 'listaEstados'.
     */
    public void setListaEstados(br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListaEstados listaEstados)
    {
        this._listaEstados = listaEstados;
    } //-- void setListaEstados(br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListaEstados) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarEstadosRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListarEstadosRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListarEstadosRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListarEstadosRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarestados.request.ListarEstadosRequest unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
