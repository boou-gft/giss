/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: GerarBalanceteRequest.java,v 1.1 2017/04/11 14:12:38 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.gerarbalancete.request;

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
 * Class GerarBalanceteRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:38 $
 */
public class GerarBalanceteRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dtMesAnoInicio
     */
    private int _dtMesAnoInicio = 0;

    /**
     * keeps track of state for field: _dtMesAnoInicio
     */
    private boolean _has_dtMesAnoInicio;

    /**
     * Field _dtMesAnoFim
     */
    private int _dtMesAnoFim = 0;

    /**
     * keeps track of state for field: _dtMesAnoFim
     */
    private boolean _has_dtMesAnoFim;

    /**
     * Field _codTipoBalancete
     */
    private java.lang.String _codTipoBalancete;


      //----------------/
     //- Constructors -/
    //----------------/

    public GerarBalanceteRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarbalancete.request.GerarBalanceteRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteDtMesAnoFim
     * 
     */
    public void deleteDtMesAnoFim()
    {
        this._has_dtMesAnoFim= false;
    } //-- void deleteDtMesAnoFim() 

    /**
     * Method deleteDtMesAnoInicio
     * 
     */
    public void deleteDtMesAnoInicio()
    {
        this._has_dtMesAnoInicio= false;
    } //-- void deleteDtMesAnoInicio() 

    /**
     * Returns the value of field 'codTipoBalancete'.
     * 
     * @return String
     * @return the value of field 'codTipoBalancete'.
     */
    public java.lang.String getCodTipoBalancete()
    {
        return this._codTipoBalancete;
    } //-- java.lang.String getCodTipoBalancete() 

    /**
     * Returns the value of field 'dtMesAnoFim'.
     * 
     * @return int
     * @return the value of field 'dtMesAnoFim'.
     */
    public int getDtMesAnoFim()
    {
        return this._dtMesAnoFim;
    } //-- int getDtMesAnoFim() 

    /**
     * Returns the value of field 'dtMesAnoInicio'.
     * 
     * @return int
     * @return the value of field 'dtMesAnoInicio'.
     */
    public int getDtMesAnoInicio()
    {
        return this._dtMesAnoInicio;
    } //-- int getDtMesAnoInicio() 

    /**
     * Method hasDtMesAnoFim
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtMesAnoFim()
    {
        return this._has_dtMesAnoFim;
    } //-- boolean hasDtMesAnoFim() 

    /**
     * Method hasDtMesAnoInicio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtMesAnoInicio()
    {
        return this._has_dtMesAnoInicio;
    } //-- boolean hasDtMesAnoInicio() 

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
     * Sets the value of field 'codTipoBalancete'.
     * 
     * @param codTipoBalancete the value of field 'codTipoBalancete'
     */
    public void setCodTipoBalancete(java.lang.String codTipoBalancete)
    {
        this._codTipoBalancete = codTipoBalancete;
    } //-- void setCodTipoBalancete(java.lang.String) 

    /**
     * Sets the value of field 'dtMesAnoFim'.
     * 
     * @param dtMesAnoFim the value of field 'dtMesAnoFim'.
     */
    public void setDtMesAnoFim(int dtMesAnoFim)
    {
        this._dtMesAnoFim = dtMesAnoFim;
        this._has_dtMesAnoFim = true;
    } //-- void setDtMesAnoFim(int) 

    /**
     * Sets the value of field 'dtMesAnoInicio'.
     * 
     * @param dtMesAnoInicio the value of field 'dtMesAnoInicio'.
     */
    public void setDtMesAnoInicio(int dtMesAnoInicio)
    {
        this._dtMesAnoInicio = dtMesAnoInicio;
        this._has_dtMesAnoInicio = true;
    } //-- void setDtMesAnoInicio(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GerarBalanceteRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.gerarbalancete.request.GerarBalanceteRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.gerarbalancete.request.GerarBalanceteRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.gerarbalancete.request.GerarBalanceteRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarbalancete.request.GerarBalanceteRequest unmarshal(java.io.Reader) 

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
