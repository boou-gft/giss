/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ExecutarBalanceteFiscalizacoesIssRequest.java,v 1.1 2017/04/11 14:11:36 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.executarbalancetefiscalizacoesiss.request;

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
 * Class ExecutarBalanceteFiscalizacoesIssRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:36 $
 */
public class ExecutarBalanceteFiscalizacoesIssRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private long _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;

    /**
     * Field _codUf
     */
    private int _codUf = 0;

    /**
     * keeps track of state for field: _codUf
     */
    private boolean _has_codUf;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _dtPeriodoInicial
     */
    private int _dtPeriodoInicial = 0;

    /**
     * keeps track of state for field: _dtPeriodoInicial
     */
    private boolean _has_dtPeriodoInicial;

    /**
     * Field _dtPeriodoFinal
     */
    private int _dtPeriodoFinal = 0;

    /**
     * keeps track of state for field: _dtPeriodoFinal
     */
    private boolean _has_dtPeriodoFinal;

    /**
     * Field _indFechadoSimulado
     */
    private java.lang.String _indFechadoSimulado;

    /**
     * Field _indConsolidado
     */
    private java.lang.String _indConsolidado;

    /**
     * Field _codNivelConta
     */
    private java.lang.String _codNivelConta;

    /**
     * Field _codGrupoInicial
     */
    private int _codGrupoInicial = 0;

    /**
     * keeps track of state for field: _codGrupoInicial
     */
    private boolean _has_codGrupoInicial;

    /**
     * Field _codGrupoFinal
     */
    private int _codGrupoFinal = 0;

    /**
     * keeps track of state for field: _codGrupoFinal
     */
    private boolean _has_codGrupoFinal;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExecutarBalanceteFiscalizacoesIssRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.executarbalancetefiscalizacoesiss.request.ExecutarBalanceteFiscalizacoesIssRequest()


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
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodGrupoFinal
     * 
     */
    public void deleteCodGrupoFinal()
    {
        this._has_codGrupoFinal= false;
    } //-- void deleteCodGrupoFinal() 

    /**
     * Method deleteCodGrupoInicial
     * 
     */
    public void deleteCodGrupoInicial()
    {
        this._has_codGrupoInicial= false;
    } //-- void deleteCodGrupoInicial() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodUf
     * 
     */
    public void deleteCodUf()
    {
        this._has_codUf= false;
    } //-- void deleteCodUf() 

    /**
     * Method deleteDtPeriodoFinal
     * 
     */
    public void deleteDtPeriodoFinal()
    {
        this._has_dtPeriodoFinal= false;
    } //-- void deleteDtPeriodoFinal() 

    /**
     * Method deleteDtPeriodoInicial
     * 
     */
    public void deleteDtPeriodoInicial()
    {
        this._has_dtPeriodoInicial= false;
    } //-- void deleteDtPeriodoInicial() 

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
     * Returns the value of field 'codEmpresa'.
     * 
     * @return long
     * @return the value of field 'codEmpresa'.
     */
    public long getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- long getCodEmpresa() 

    /**
     * Returns the value of field 'codGrupoFinal'.
     * 
     * @return int
     * @return the value of field 'codGrupoFinal'.
     */
    public int getCodGrupoFinal()
    {
        return this._codGrupoFinal;
    } //-- int getCodGrupoFinal() 

    /**
     * Returns the value of field 'codGrupoInicial'.
     * 
     * @return int
     * @return the value of field 'codGrupoInicial'.
     */
    public int getCodGrupoInicial()
    {
        return this._codGrupoInicial;
    } //-- int getCodGrupoInicial() 

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
     * Returns the value of field 'codNivelConta'.
     * 
     * @return String
     * @return the value of field 'codNivelConta'.
     */
    public java.lang.String getCodNivelConta()
    {
        return this._codNivelConta;
    } //-- java.lang.String getCodNivelConta() 

    /**
     * Returns the value of field 'codUf'.
     * 
     * @return int
     * @return the value of field 'codUf'.
     */
    public int getCodUf()
    {
        return this._codUf;
    } //-- int getCodUf() 

    /**
     * Returns the value of field 'dtPeriodoFinal'.
     * 
     * @return int
     * @return the value of field 'dtPeriodoFinal'.
     */
    public int getDtPeriodoFinal()
    {
        return this._dtPeriodoFinal;
    } //-- int getDtPeriodoFinal() 

    /**
     * Returns the value of field 'dtPeriodoInicial'.
     * 
     * @return int
     * @return the value of field 'dtPeriodoInicial'.
     */
    public int getDtPeriodoInicial()
    {
        return this._dtPeriodoInicial;
    } //-- int getDtPeriodoInicial() 

    /**
     * Returns the value of field 'indConsolidado'.
     * 
     * @return String
     * @return the value of field 'indConsolidado'.
     */
    public java.lang.String getIndConsolidado()
    {
        return this._indConsolidado;
    } //-- java.lang.String getIndConsolidado() 

    /**
     * Returns the value of field 'indFechadoSimulado'.
     * 
     * @return String
     * @return the value of field 'indFechadoSimulado'.
     */
    public java.lang.String getIndFechadoSimulado()
    {
        return this._indFechadoSimulado;
    } //-- java.lang.String getIndFechadoSimulado() 

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
     * Method hasCodGrupoFinal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupoFinal()
    {
        return this._has_codGrupoFinal;
    } //-- boolean hasCodGrupoFinal() 

    /**
     * Method hasCodGrupoInicial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupoInicial()
    {
        return this._has_codGrupoInicial;
    } //-- boolean hasCodGrupoInicial() 

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
     * Method hasCodUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUf()
    {
        return this._has_codUf;
    } //-- boolean hasCodUf() 

    /**
     * Method hasDtPeriodoFinal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtPeriodoFinal()
    {
        return this._has_dtPeriodoFinal;
    } //-- boolean hasDtPeriodoFinal() 

    /**
     * Method hasDtPeriodoInicial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtPeriodoInicial()
    {
        return this._has_dtPeriodoInicial;
    } //-- boolean hasDtPeriodoInicial() 

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
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(long codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(long) 

    /**
     * Sets the value of field 'codGrupoFinal'.
     * 
     * @param codGrupoFinal the value of field 'codGrupoFinal'.
     */
    public void setCodGrupoFinal(int codGrupoFinal)
    {
        this._codGrupoFinal = codGrupoFinal;
        this._has_codGrupoFinal = true;
    } //-- void setCodGrupoFinal(int) 

    /**
     * Sets the value of field 'codGrupoInicial'.
     * 
     * @param codGrupoInicial the value of field 'codGrupoInicial'.
     */
    public void setCodGrupoInicial(int codGrupoInicial)
    {
        this._codGrupoInicial = codGrupoInicial;
        this._has_codGrupoInicial = true;
    } //-- void setCodGrupoInicial(int) 

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
     * Sets the value of field 'codNivelConta'.
     * 
     * @param codNivelConta the value of field 'codNivelConta'.
     */
    public void setCodNivelConta(java.lang.String codNivelConta)
    {
        this._codNivelConta = codNivelConta;
    } //-- void setCodNivelConta(java.lang.String) 

    /**
     * Sets the value of field 'codUf'.
     * 
     * @param codUf the value of field 'codUf'.
     */
    public void setCodUf(int codUf)
    {
        this._codUf = codUf;
        this._has_codUf = true;
    } //-- void setCodUf(int) 

    /**
     * Sets the value of field 'dtPeriodoFinal'.
     * 
     * @param dtPeriodoFinal the value of field 'dtPeriodoFinal'.
     */
    public void setDtPeriodoFinal(int dtPeriodoFinal)
    {
        this._dtPeriodoFinal = dtPeriodoFinal;
        this._has_dtPeriodoFinal = true;
    } //-- void setDtPeriodoFinal(int) 

    /**
     * Sets the value of field 'dtPeriodoInicial'.
     * 
     * @param dtPeriodoInicial the value of field 'dtPeriodoInicial'
     */
    public void setDtPeriodoInicial(int dtPeriodoInicial)
    {
        this._dtPeriodoInicial = dtPeriodoInicial;
        this._has_dtPeriodoInicial = true;
    } //-- void setDtPeriodoInicial(int) 

    /**
     * Sets the value of field 'indConsolidado'.
     * 
     * @param indConsolidado the value of field 'indConsolidado'.
     */
    public void setIndConsolidado(java.lang.String indConsolidado)
    {
        this._indConsolidado = indConsolidado;
    } //-- void setIndConsolidado(java.lang.String) 

    /**
     * Sets the value of field 'indFechadoSimulado'.
     * 
     * @param indFechadoSimulado the value of field
     * 'indFechadoSimulado'.
     */
    public void setIndFechadoSimulado(java.lang.String indFechadoSimulado)
    {
        this._indFechadoSimulado = indFechadoSimulado;
    } //-- void setIndFechadoSimulado(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExecutarBalanceteFiscalizacoesIssRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.executarbalancetefiscalizacoesiss.request.ExecutarBalanceteFiscalizacoesIssRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.executarbalancetefiscalizacoesiss.request.ExecutarBalanceteFiscalizacoesIssRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.executarbalancetefiscalizacoesiss.request.ExecutarBalanceteFiscalizacoesIssRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.executarbalancetefiscalizacoesiss.request.ExecutarBalanceteFiscalizacoesIssRequest unmarshal(java.io.Reader) 

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
