/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response;

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
 * Class ListaHistoricoEmpresa.
 * 
 * @version $Revision$ $Date$
 */
public class ListaHistoricoEmpresa implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _nomeEmpresa
     */
    private java.lang.String _nomeEmpresa;

    /**
     * Field _dataHoraAtualizacao
     */
    private java.lang.String _dataHoraAtualizacao;

    /**
     * Field _status
     */
    private java.lang.String _status;

    /**
     * Field _codFuncional
     */
    private java.lang.String _codFuncional;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaHistoricoEmpresa() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

    /**
     * Returns the value of field 'codFuncional'.
     * 
     * @return String
     * @return the value of field 'codFuncional'.
     */
    public java.lang.String getCodFuncional()
    {
        return this._codFuncional;
    } //-- java.lang.String getCodFuncional() 

    /**
     * Returns the value of field 'dataHoraAtualizacao'.
     * 
     * @return String
     * @return the value of field 'dataHoraAtualizacao'.
     */
    public java.lang.String getDataHoraAtualizacao()
    {
        return this._dataHoraAtualizacao;
    } //-- java.lang.String getDataHoraAtualizacao() 

    /**
     * Returns the value of field 'nomeEmpresa'.
     * 
     * @return String
     * @return the value of field 'nomeEmpresa'.
     */
    public java.lang.String getNomeEmpresa()
    {
        return this._nomeEmpresa;
    } //-- java.lang.String getNomeEmpresa() 

    /**
     * Returns the value of field 'status'.
     * 
     * @return String
     * @return the value of field 'status'.
     */
    public java.lang.String getStatus()
    {
        return this._status;
    } //-- java.lang.String getStatus() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

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
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

    /**
     * Sets the value of field 'codFuncional'.
     * 
     * @param codFuncional the value of field 'codFuncional'.
     */
    public void setCodFuncional(java.lang.String codFuncional)
    {
        this._codFuncional = codFuncional;
    } //-- void setCodFuncional(java.lang.String) 

    /**
     * Sets the value of field 'dataHoraAtualizacao'.
     * 
     * @param dataHoraAtualizacao the value of field
     * 'dataHoraAtualizacao'.
     */
    public void setDataHoraAtualizacao(java.lang.String dataHoraAtualizacao)
    {
        this._dataHoraAtualizacao = dataHoraAtualizacao;
    } //-- void setDataHoraAtualizacao(java.lang.String) 

    /**
     * Sets the value of field 'nomeEmpresa'.
     * 
     * @param nomeEmpresa the value of field 'nomeEmpresa'.
     */
    public void setNomeEmpresa(java.lang.String nomeEmpresa)
    {
        this._nomeEmpresa = nomeEmpresa;
    } //-- void setNomeEmpresa(java.lang.String) 

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaHistoricoEmpresa
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa unmarshal(java.io.Reader) 

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
