/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request;

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
 * Class ListarDependenciasMunicipioRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarDependenciasMunicipioRequest implements java.io.Serializable {


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
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _codPessoaJuridica
     */
    private long _codPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codPessoaJuridica
     */
    private boolean _has_codPessoaJuridica;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;

    /**
     * Field _qtdDependenciasAtivas
     */
    private int _qtdDependenciasAtivas = 0;

    /**
     * keeps track of state for field: _qtdDependenciasAtivas
     */
    private boolean _has_qtdDependenciasAtivas;

    /**
     * Field _qtdDependenciasEncer
     */
    private int _qtdDependenciasEncer = 0;

    /**
     * keeps track of state for field: _qtdDependenciasEncer
     */
    private boolean _has_qtdDependenciasEncer;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDependenciasMunicipioRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request.ListarDependenciasMunicipioRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodPessoaJuridica
     * 
     */
    public void deleteCodPessoaJuridica()
    {
        this._has_codPessoaJuridica= false;
    } //-- void deleteCodPessoaJuridica() 

    /**
     * Method deleteQtdDependenciasAtivas
     * 
     */
    public void deleteQtdDependenciasAtivas()
    {
        this._has_qtdDependenciasAtivas= false;
    } //-- void deleteQtdDependenciasAtivas() 

    /**
     * Method deleteQtdDependenciasEncer
     * 
     */
    public void deleteQtdDependenciasEncer()
    {
        this._has_qtdDependenciasEncer= false;
    } //-- void deleteQtdDependenciasEncer() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

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
     * Returns the value of field 'codPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codPessoaJuridica'.
     */
    public long getCodPessoaJuridica()
    {
        return this._codPessoaJuridica;
    } //-- long getCodPessoaJuridica() 

    /**
     * Returns the value of field 'qtdDependenciasAtivas'.
     * 
     * @return int
     * @return the value of field 'qtdDependenciasAtivas'.
     */
    public int getQtdDependenciasAtivas()
    {
        return this._qtdDependenciasAtivas;
    } //-- int getQtdDependenciasAtivas() 

    /**
     * Returns the value of field 'qtdDependenciasEncer'.
     * 
     * @return int
     * @return the value of field 'qtdDependenciasEncer'.
     */
    public int getQtdDependenciasEncer()
    {
        return this._qtdDependenciasEncer;
    } //-- int getQtdDependenciasEncer() 

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
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

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
     * Method hasCodPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJuridica()
    {
        return this._has_codPessoaJuridica;
    } //-- boolean hasCodPessoaJuridica() 

    /**
     * Method hasQtdDependenciasAtivas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdDependenciasAtivas()
    {
        return this._has_qtdDependenciasAtivas;
    } //-- boolean hasQtdDependenciasAtivas() 

    /**
     * Method hasQtdDependenciasEncer
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdDependenciasEncer()
    {
        return this._has_qtdDependenciasEncer;
    } //-- boolean hasQtdDependenciasEncer() 

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
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

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
     * Sets the value of field 'codPessoaJuridica'.
     * 
     * @param codPessoaJuridica the value of field
     * 'codPessoaJuridica'.
     */
    public void setCodPessoaJuridica(long codPessoaJuridica)
    {
        this._codPessoaJuridica = codPessoaJuridica;
        this._has_codPessoaJuridica = true;
    } //-- void setCodPessoaJuridica(long) 

    /**
     * Sets the value of field 'qtdDependenciasAtivas'.
     * 
     * @param qtdDependenciasAtivas the value of field
     * 'qtdDependenciasAtivas'.
     */
    public void setQtdDependenciasAtivas(int qtdDependenciasAtivas)
    {
        this._qtdDependenciasAtivas = qtdDependenciasAtivas;
        this._has_qtdDependenciasAtivas = true;
    } //-- void setQtdDependenciasAtivas(int) 

    /**
     * Sets the value of field 'qtdDependenciasEncer'.
     * 
     * @param qtdDependenciasEncer the value of field
     * 'qtdDependenciasEncer'.
     */
    public void setQtdDependenciasEncer(int qtdDependenciasEncer)
    {
        this._qtdDependenciasEncer = qtdDependenciasEncer;
        this._has_qtdDependenciasEncer = true;
    } //-- void setQtdDependenciasEncer(int) 

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
     * @return ListarDependenciasMunicipioRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request.ListarDependenciasMunicipioRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request.ListarDependenciasMunicipioRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request.ListarDependenciasMunicipioRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request.ListarDependenciasMunicipioRequest unmarshal(java.io.Reader) 

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
