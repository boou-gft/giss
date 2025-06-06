/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarListaContasTipoServicoRequest.java,v 1.2 2018/06/06 17:36:50 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.request;

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
 * Class ConsultarListaContasTipoServicoRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2018/06/06 17:36:50 $
 */
public class ConsultarListaContasTipoServicoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _nroMaxOcorrencias
     */
    private int _nroMaxOcorrencias = 0;

    /**
     * keeps track of state for field: _nroMaxOcorrencias
     */
    private boolean _has_nroMaxOcorrencias;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoTipoServico
     */
    private int _codigoTipoServico = 0;

    /**
     * keeps track of state for field: _codigoTipoServico
     */
    private boolean _has_codigoTipoServico;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarListaContasTipoServicoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.request.ConsultarListaContasTipoServicoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoTipoServico
     * 
     */
    public void deleteCodigoTipoServico()
    {
        this._has_codigoTipoServico= false;
    } //-- void deleteCodigoTipoServico() 

    /**
     * Method deleteNroMaxOcorrencias
     * 
     */
    public void deleteNroMaxOcorrencias()
    {
        this._has_nroMaxOcorrencias= false;
    } //-- void deleteNroMaxOcorrencias() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'codigoTipoServico'.
     * 
     * @return int
     * @return the value of field 'codigoTipoServico'.
     */
    public int getCodigoTipoServico()
    {
        return this._codigoTipoServico;
    } //-- int getCodigoTipoServico() 

    /**
     * Returns the value of field 'nroMaxOcorrencias'.
     * 
     * @return int
     * @return the value of field 'nroMaxOcorrencias'.
     */
    public int getNroMaxOcorrencias()
    {
        return this._nroMaxOcorrencias;
    } //-- int getNroMaxOcorrencias() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

    /**
     * Method hasCodigoTipoServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoServico()
    {
        return this._has_codigoTipoServico;
    } //-- boolean hasCodigoTipoServico() 

    /**
     * Method hasNroMaxOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroMaxOcorrencias()
    {
        return this._has_nroMaxOcorrencias;
    } //-- boolean hasNroMaxOcorrencias() 

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
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'codigoTipoServico'.
     * 
     * @param codigoTipoServico the value of field
     * 'codigoTipoServico'.
     */
    public void setCodigoTipoServico(int codigoTipoServico)
    {
        this._codigoTipoServico = codigoTipoServico;
        this._has_codigoTipoServico = true;
    } //-- void setCodigoTipoServico(int) 

    /**
     * Sets the value of field 'nroMaxOcorrencias'.
     * 
     * @param nroMaxOcorrencias the value of field
     * 'nroMaxOcorrencias'.
     */
    public void setNroMaxOcorrencias(int nroMaxOcorrencias)
    {
        this._nroMaxOcorrencias = nroMaxOcorrencias;
        this._has_nroMaxOcorrencias = true;
    } //-- void setNroMaxOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarListaContasTipoServicoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.request.ConsultarListaContasTipoServicoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.request.ConsultarListaContasTipoServicoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.request.ConsultarListaContasTipoServicoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.request.ConsultarListaContasTipoServicoRequest unmarshal(java.io.Reader) 

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
