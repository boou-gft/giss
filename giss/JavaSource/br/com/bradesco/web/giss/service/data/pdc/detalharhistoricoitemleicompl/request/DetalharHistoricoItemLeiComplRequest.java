/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.request;

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
 * Class DetalharHistoricoItemLeiComplRequest.
 * 
 * @version $Revision$ $Date$
 */
public class DetalharHistoricoItemLeiComplRequest implements java.io.Serializable {


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

    /**
     * Field _dataHoraManutencao
     */
    private java.lang.String _dataHoraManutencao;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharHistoricoItemLeiComplRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.request.DetalharHistoricoItemLeiComplRequest()


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
     * Returns the value of field 'dataHoraManutencao'.
     * 
     * @return String
     * @return the value of field 'dataHoraManutencao'.
     */
    public java.lang.String getDataHoraManutencao()
    {
        return this._dataHoraManutencao;
    } //-- java.lang.String getDataHoraManutencao() 

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
     * Sets the value of field 'dataHoraManutencao'.
     * 
     * @param dataHoraManutencao the value of field
     * 'dataHoraManutencao'.
     */
    public void setDataHoraManutencao(java.lang.String dataHoraManutencao)
    {
        this._dataHoraManutencao = dataHoraManutencao;
    } //-- void setDataHoraManutencao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return DetalharHistoricoItemLeiComplRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.request.DetalharHistoricoItemLeiComplRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.request.DetalharHistoricoItemLeiComplRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.request.DetalharHistoricoItemLeiComplRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.request.DetalharHistoricoItemLeiComplRequest unmarshal(java.io.Reader) 

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
