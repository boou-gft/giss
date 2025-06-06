/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.request;

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
 * Class ListarHistoricoEmpresaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarHistoricoEmpresaRequest implements java.io.Serializable {


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
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _cnpjEmpresa
     */
    private long _cnpjEmpresa = 0;

    /**
     * keeps track of state for field: _cnpjEmpresa
     */
    private boolean _has_cnpjEmpresa;

    /**
     * Field _data
     */
    private java.lang.String _data;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarHistoricoEmpresaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.request.ListarHistoricoEmpresaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCnpjEmpresa
     * 
     */
    public void deleteCnpjEmpresa()
    {
        this._has_cnpjEmpresa= false;
    } //-- void deleteCnpjEmpresa() 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Returns the value of field 'cnpjEmpresa'.
     * 
     * @return long
     * @return the value of field 'cnpjEmpresa'.
     */
    public long getCnpjEmpresa()
    {
        return this._cnpjEmpresa;
    } //-- long getCnpjEmpresa() 

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
     * Returns the value of field 'data'.
     * 
     * @return String
     * @return the value of field 'data'.
     */
    public java.lang.String getData()
    {
        return this._data;
    } //-- java.lang.String getData() 

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
     * Method hasCnpjEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjEmpresa()
    {
        return this._has_cnpjEmpresa;
    } //-- boolean hasCnpjEmpresa() 

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
     * Sets the value of field 'cnpjEmpresa'.
     * 
     * @param cnpjEmpresa the value of field 'cnpjEmpresa'.
     */
    public void setCnpjEmpresa(long cnpjEmpresa)
    {
        this._cnpjEmpresa = cnpjEmpresa;
        this._has_cnpjEmpresa = true;
    } //-- void setCnpjEmpresa(long) 

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
     * Sets the value of field 'data'.
     * 
     * @param data the value of field 'data'.
     */
    public void setData(java.lang.String data)
    {
        this._data = data;
    } //-- void setData(java.lang.String) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarHistoricoEmpresaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.request.ListarHistoricoEmpresaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.request.ListarHistoricoEmpresaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.request.ListarHistoricoEmpresaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.request.ListarHistoricoEmpresaRequest unmarshal(java.io.Reader) 

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
