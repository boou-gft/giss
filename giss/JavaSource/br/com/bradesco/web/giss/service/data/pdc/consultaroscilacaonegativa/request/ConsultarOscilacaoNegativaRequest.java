/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.request;

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
 * Class ConsultarOscilacaoNegativaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarOscilacaoNegativaRequest implements java.io.Serializable {


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
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _nroSeqUndOrganizacional
     */
    private int _nroSeqUndOrganizacional = 0;

    /**
     * keeps track of state for field: _nroSeqUndOrganizacional
     */
    private boolean _has_nroSeqUndOrganizacional;

    /**
     * Field _cdDepend
     */
    private int _cdDepend = 0;

    /**
     * keeps track of state for field: _cdDepend
     */
    private boolean _has_cdDepend;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarOscilacaoNegativaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.request.ConsultarOscilacaoNegativaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCdDepend
     * 
     */
    public void deleteCdDepend()
    {
        this._has_cdDepend= false;
    } //-- void deleteCdDepend() 

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteNroMaxOcorrencias
     * 
     */
    public void deleteNroMaxOcorrencias()
    {
        this._has_nroMaxOcorrencias= false;
    } //-- void deleteNroMaxOcorrencias() 

    /**
     * Method deleteNroSeqUndOrganizacional
     * 
     */
    public void deleteNroSeqUndOrganizacional()
    {
        this._has_nroSeqUndOrganizacional= false;
    } //-- void deleteNroSeqUndOrganizacional() 

    /**
     * Returns the value of field 'cdDepend'.
     * 
     * @return int
     * @return the value of field 'cdDepend'.
     */
    public int getCdDepend()
    {
        return this._cdDepend;
    } //-- int getCdDepend() 

    /**
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public long getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- long getCodigoPessoaJuridica() 

    /**
     * Returns the value of field 'mesAnoApuracao'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracao'.
     */
    public int getMesAnoApuracao()
    {
        return this._mesAnoApuracao;
    } //-- int getMesAnoApuracao() 

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
     * Returns the value of field 'nroSeqUndOrganizacional'.
     * 
     * @return int
     * @return the value of field 'nroSeqUndOrganizacional'.
     */
    public int getNroSeqUndOrganizacional()
    {
        return this._nroSeqUndOrganizacional;
    } //-- int getNroSeqUndOrganizacional() 

    /**
     * Method hasCdDepend
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdDepend()
    {
        return this._has_cdDepend;
    } //-- boolean hasCdDepend() 

    /**
     * Method hasCodigoPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridica()
    {
        return this._has_codigoPessoaJuridica;
    } //-- boolean hasCodigoPessoaJuridica() 

    /**
     * Method hasMesAnoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracao()
    {
        return this._has_mesAnoApuracao;
    } //-- boolean hasMesAnoApuracao() 

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
     * Method hasNroSeqUndOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroSeqUndOrganizacional()
    {
        return this._has_nroSeqUndOrganizacional;
    } //-- boolean hasNroSeqUndOrganizacional() 

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
     * Sets the value of field 'cdDepend'.
     * 
     * @param cdDepend the value of field 'cdDepend'.
     */
    public void setCdDepend(int cdDepend)
    {
        this._cdDepend = cdDepend;
        this._has_cdDepend = true;
    } //-- void setCdDepend(int) 

    /**
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(long codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(long) 

    /**
     * Sets the value of field 'mesAnoApuracao'.
     * 
     * @param mesAnoApuracao the value of field 'mesAnoApuracao'.
     */
    public void setMesAnoApuracao(int mesAnoApuracao)
    {
        this._mesAnoApuracao = mesAnoApuracao;
        this._has_mesAnoApuracao = true;
    } //-- void setMesAnoApuracao(int) 

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
     * Sets the value of field 'nroSeqUndOrganizacional'.
     * 
     * @param nroSeqUndOrganizacional the value of field
     * 'nroSeqUndOrganizacional'.
     */
    public void setNroSeqUndOrganizacional(int nroSeqUndOrganizacional)
    {
        this._nroSeqUndOrganizacional = nroSeqUndOrganizacional;
        this._has_nroSeqUndOrganizacional = true;
    } //-- void setNroSeqUndOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarOscilacaoNegativaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.request.ConsultarOscilacaoNegativaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.request.ConsultarOscilacaoNegativaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.request.ConsultarOscilacaoNegativaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.request.ConsultarOscilacaoNegativaRequest unmarshal(java.io.Reader) 

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
