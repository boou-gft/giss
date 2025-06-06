/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.request;

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
 * Class ListarHistoricoItemLeiComplRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarHistoricoItemLeiComplRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codItemLei
     */
    private int _codItemLei = 0;

    /**
     * keeps track of state for field: _codItemLei
     */
    private boolean _has_codItemLei;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarHistoricoItemLeiComplRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.request.ListarHistoricoItemLeiComplRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemLei
     * 
     */
    public void deleteCodItemLei()
    {
        this._has_codItemLei= false;
    } //-- void deleteCodItemLei() 

    /**
     * Returns the value of field 'codItemLei'.
     * 
     * @return int
     * @return the value of field 'codItemLei'.
     */
    public int getCodItemLei()
    {
        return this._codItemLei;
    } //-- int getCodItemLei() 

    /**
     * Method hasCodItemLei
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLei()
    {
        return this._has_codItemLei;
    } //-- boolean hasCodItemLei() 

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
     * Sets the value of field 'codItemLei'.
     * 
     * @param codItemLei the value of field 'codItemLei'.
     */
    public void setCodItemLei(int codItemLei)
    {
        this._codItemLei = codItemLei;
        this._has_codItemLei = true;
    } //-- void setCodItemLei(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarHistoricoItemLeiComplRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.request.ListarHistoricoItemLeiComplRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.request.ListarHistoricoItemLeiComplRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.request.ListarHistoricoItemLeiComplRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.request.ListarHistoricoItemLeiComplRequest unmarshal(java.io.Reader) 

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
