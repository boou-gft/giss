/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.request;

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
 * Class DetalharMunicipioHistoricoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class DetalharMunicipioHistoricoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _siglaUf
     */
    private int _siglaUf = 0;

    /**
     * keeps track of state for field: _siglaUf
     */
    private boolean _has_siglaUf;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _manutencao
     */
    private java.lang.String _manutencao;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharMunicipioHistoricoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.request.DetalharMunicipioHistoricoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method deleteSiglaUf
     * 
     */
    public void deleteSiglaUf()
    {
        this._has_siglaUf= false;
    } //-- void deleteSiglaUf() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'manutencao'.
     * 
     * @return String
     * @return the value of field 'manutencao'.
     */
    public java.lang.String getManutencao()
    {
        return this._manutencao;
    } //-- java.lang.String getManutencao() 

    /**
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

    /**
     * Returns the value of field 'siglaUf'.
     * 
     * @return int
     * @return the value of field 'siglaUf'.
     */
    public int getSiglaUf()
    {
        return this._siglaUf;
    } //-- int getSiglaUf() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

    /**
     * Method hasSiglaUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSiglaUf()
    {
        return this._has_siglaUf;
    } //-- boolean hasSiglaUf() 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'manutencao'.
     * 
     * @param manutencao the value of field 'manutencao'.
     */
    public void setManutencao(java.lang.String manutencao)
    {
        this._manutencao = manutencao;
    } //-- void setManutencao(java.lang.String) 

    /**
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Sets the value of field 'siglaUf'.
     * 
     * @param siglaUf the value of field 'siglaUf'.
     */
    public void setSiglaUf(int siglaUf)
    {
        this._siglaUf = siglaUf;
        this._has_siglaUf = true;
    } //-- void setSiglaUf(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return DetalharMunicipioHistoricoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.request.DetalharMunicipioHistoricoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.request.DetalharMunicipioHistoricoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.request.DetalharMunicipioHistoricoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.request.DetalharMunicipioHistoricoRequest unmarshal(java.io.Reader) 

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
