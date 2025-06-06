/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarTipoServicoRequest.java,v 1.1 2017/04/11 14:12:22 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listartiposervico.request;

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
 * Class ListarTipoServicoRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:22 $
 */
public class ListarTipoServicoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigotiposervico
     */
    private int _codigotiposervico = 0;

    /**
     * keeps track of state for field: _codigotiposervico
     */
    private boolean _has_codigotiposervico;

    /**
     * Field _descricaotiposervico
     */
    private java.lang.String _descricaotiposervico;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarTipoServicoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.piloto.service.data.pdc.listartiposervico.request.ListarTipoServicoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigotiposervico
     * 
     */
    public void deleteCodigotiposervico()
    {
        this._has_codigotiposervico= false;
    } //-- void deleteCodigotiposervico() 

    /**
     * Returns the value of field 'codigotiposervico'.
     * 
     * @return int
     * @return the value of field 'codigotiposervico'.
     */
    public int getCodigotiposervico()
    {
        return this._codigotiposervico;
    } //-- int getCodigotiposervico() 

    /**
     * Returns the value of field 'descricaotiposervico'.
     * 
     * @return String
     * @return the value of field 'descricaotiposervico'.
     */
    public java.lang.String getDescricaotiposervico()
    {
        return this._descricaotiposervico;
    } //-- java.lang.String getDescricaotiposervico() 

    /**
     * Method hasCodigotiposervico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigotiposervico()
    {
        return this._has_codigotiposervico;
    } //-- boolean hasCodigotiposervico() 

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
     * Sets the value of field 'codigotiposervico'.
     * 
     * @param codigotiposervico the value of field
     * 'codigotiposervico'.
     */
    public void setCodigotiposervico(int codigotiposervico)
    {
        this._codigotiposervico = codigotiposervico;
        this._has_codigotiposervico = true;
    } //-- void setCodigotiposervico(int) 

    /**
     * Sets the value of field 'descricaotiposervico'.
     * 
     * @param descricaotiposervico the value of field
     * 'descricaotiposervico'.
     */
    public void setDescricaotiposervico(java.lang.String descricaotiposervico)
    {
        this._descricaotiposervico = descricaotiposervico;
    } //-- void setDescricaotiposervico(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarTipoServicoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listartiposervico.request.ListarTipoServicoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listartiposervico.request.ListarTipoServicoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listartiposervico.request.ListarTipoServicoRequest.class, reader);
    } //-- br.com.bradesco.web.piloto.service.data.pdc.listartiposervico.request.ListarTipoServicoRequest unmarshal(java.io.Reader) 

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
