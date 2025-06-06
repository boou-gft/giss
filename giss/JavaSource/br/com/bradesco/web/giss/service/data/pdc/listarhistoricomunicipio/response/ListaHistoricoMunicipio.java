/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response;

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
 * Class ListaHistoricoMunicipio.
 * 
 * @version $Revision$ $Date$
 */
public class ListaHistoricoMunicipio implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoUf
     */
    private int _codigoUf = 0;

    /**
     * keeps track of state for field: _codigoUf
     */
    private boolean _has_codigoUf;

    /**
     * Field _siglaUf
     */
    private java.lang.String _siglaUf;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _nomeMunicipio
     */
    private java.lang.String _nomeMunicipio;

    /**
     * Field _dadosManutencao
     */
    private java.lang.String _dadosManutencao;

    /**
     * Field _dataFimVigencia
     */
    private java.lang.String _dataFimVigencia;

    /**
     * Field _usuarioManutencao
     */
    private java.lang.String _usuarioManutencao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaHistoricoMunicipio() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio()


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
     * Method deleteCodigoUf
     * 
     */
    public void deleteCodigoUf()
    {
        this._has_codigoUf= false;
    } //-- void deleteCodigoUf() 

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
     * Returns the value of field 'codigoUf'.
     * 
     * @return int
     * @return the value of field 'codigoUf'.
     */
    public int getCodigoUf()
    {
        return this._codigoUf;
    } //-- int getCodigoUf() 

    /**
     * Returns the value of field 'dadosManutencao'.
     * 
     * @return String
     * @return the value of field 'dadosManutencao'.
     */
    public java.lang.String getDadosManutencao()
    {
        return this._dadosManutencao;
    } //-- java.lang.String getDadosManutencao() 

    /**
     * Returns the value of field 'dataFimVigencia'.
     * 
     * @return String
     * @return the value of field 'dataFimVigencia'.
     */
    public java.lang.String getDataFimVigencia()
    {
        return this._dataFimVigencia;
    } //-- java.lang.String getDataFimVigencia() 

    /**
     * Returns the value of field 'nomeMunicipio'.
     * 
     * @return String
     * @return the value of field 'nomeMunicipio'.
     */
    public java.lang.String getNomeMunicipio()
    {
        return this._nomeMunicipio;
    } //-- java.lang.String getNomeMunicipio() 

    /**
     * Returns the value of field 'siglaUf'.
     * 
     * @return String
     * @return the value of field 'siglaUf'.
     */
    public java.lang.String getSiglaUf()
    {
        return this._siglaUf;
    } //-- java.lang.String getSiglaUf() 

    /**
     * Returns the value of field 'usuarioManutencao'.
     * 
     * @return String
     * @return the value of field 'usuarioManutencao'.
     */
    public java.lang.String getUsuarioManutencao()
    {
        return this._usuarioManutencao;
    } //-- java.lang.String getUsuarioManutencao() 

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
     * Method hasCodigoUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUf()
    {
        return this._has_codigoUf;
    } //-- boolean hasCodigoUf() 

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
     * Sets the value of field 'codigoUf'.
     * 
     * @param codigoUf the value of field 'codigoUf'.
     */
    public void setCodigoUf(int codigoUf)
    {
        this._codigoUf = codigoUf;
        this._has_codigoUf = true;
    } //-- void setCodigoUf(int) 

    /**
     * Sets the value of field 'dadosManutencao'.
     * 
     * @param dadosManutencao the value of field 'dadosManutencao'.
     */
    public void setDadosManutencao(java.lang.String dadosManutencao)
    {
        this._dadosManutencao = dadosManutencao;
    } //-- void setDadosManutencao(java.lang.String) 

    /**
     * Sets the value of field 'dataFimVigencia'.
     * 
     * @param dataFimVigencia the value of field 'dataFimVigencia'.
     */
    public void setDataFimVigencia(java.lang.String dataFimVigencia)
    {
        this._dataFimVigencia = dataFimVigencia;
    } //-- void setDataFimVigencia(java.lang.String) 

    /**
     * Sets the value of field 'nomeMunicipio'.
     * 
     * @param nomeMunicipio the value of field 'nomeMunicipio'.
     */
    public void setNomeMunicipio(java.lang.String nomeMunicipio)
    {
        this._nomeMunicipio = nomeMunicipio;
    } //-- void setNomeMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'siglaUf'.
     * 
     * @param siglaUf the value of field 'siglaUf'.
     */
    public void setSiglaUf(java.lang.String siglaUf)
    {
        this._siglaUf = siglaUf;
    } //-- void setSiglaUf(java.lang.String) 

    /**
     * Sets the value of field 'usuarioManutencao'.
     * 
     * @param usuarioManutencao the value of field
     * 'usuarioManutencao'.
     */
    public void setUsuarioManutencao(java.lang.String usuarioManutencao)
    {
        this._usuarioManutencao = usuarioManutencao;
    } //-- void setUsuarioManutencao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaHistoricoMunicipio
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio unmarshal(java.io.Reader) 

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
