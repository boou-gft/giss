/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarBalancetesResponse.java,v 1.1 2017/04/11 14:11:21 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarBalancetesResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:21 $
 */
public class ListarBalancetesResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _descEmpresa
     */
    private java.lang.String _descEmpresa;

    /**
     * Field _cpfCnpj
     */
    private long _cpfCnpj = 0;

    /**
     * keeps track of state for field: _cpfCnpj
     */
    private boolean _has_cpfCnpj;

    /**
     * Field _controle
     */
    private int _controle = 0;

    /**
     * keeps track of state for field: _controle
     */
    private boolean _has_controle;

    /**
     * Field _filial
     */
    private int _filial = 0;

    /**
     * keeps track of state for field: _filial
     */
    private boolean _has_filial;

    /**
     * Field _codGrupoInicio
     */
    private int _codGrupoInicio = 0;

    /**
     * keeps track of state for field: _codGrupoInicio
     */
    private boolean _has_codGrupoInicio;

    /**
     * Field _codGrupoFim
     */
    private int _codGrupoFim = 0;

    /**
     * keeps track of state for field: _codGrupoFim
     */
    private boolean _has_codGrupoFim;

    /**
     * Field _codNivelConta
     */
    private java.lang.String _codNivelConta;

    /**
     * Field _descDependencia
     */
    private java.lang.String _descDependencia;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _siglaUf
     */
    private java.lang.String _siglaUf;

    /**
     * Field _codTipoBalancete
     */
    private java.lang.String _codTipoBalancete;

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarBalancetesResponse() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.ListarBalancetesResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param vOcorrencias
     */
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias) 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodGrupoFim
     * 
     */
    public void deleteCodGrupoFim()
    {
        this._has_codGrupoFim= false;
    } //-- void deleteCodGrupoFim() 

    /**
     * Method deleteCodGrupoInicio
     * 
     */
    public void deleteCodGrupoInicio()
    {
        this._has_codGrupoInicio= false;
    } //-- void deleteCodGrupoInicio() 

    /**
     * Method deleteControle
     * 
     */
    public void deleteControle()
    {
        this._has_controle= false;
    } //-- void deleteControle() 

    /**
     * Method deleteCpfCnpj
     * 
     */
    public void deleteCpfCnpj()
    {
        this._has_cpfCnpj= false;
    } //-- void deleteCpfCnpj() 

    /**
     * Method deleteFilial
     * 
     */
    public void deleteFilial()
    {
        this._has_filial= false;
    } //-- void deleteFilial() 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrencias
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrencias()
    {
        return _ocorrenciasList.elements();
    } //-- java.util.Enumeration enumerateOcorrencias() 

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
     * Returns the value of field 'codGrupoFim'.
     * 
     * @return int
     * @return the value of field 'codGrupoFim'.
     */
    public int getCodGrupoFim()
    {
        return this._codGrupoFim;
    } //-- int getCodGrupoFim() 

    /**
     * Returns the value of field 'codGrupoInicio'.
     * 
     * @return int
     * @return the value of field 'codGrupoInicio'.
     */
    public int getCodGrupoInicio()
    {
        return this._codGrupoInicio;
    } //-- int getCodGrupoInicio() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

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
     * Returns the value of field 'controle'.
     * 
     * @return int
     * @return the value of field 'controle'.
     */
    public int getControle()
    {
        return this._controle;
    } //-- int getControle() 

    /**
     * Returns the value of field 'cpfCnpj'.
     * 
     * @return long
     * @return the value of field 'cpfCnpj'.
     */
    public long getCpfCnpj()
    {
        return this._cpfCnpj;
    } //-- long getCpfCnpj() 

    /**
     * Returns the value of field 'descDependencia'.
     * 
     * @return String
     * @return the value of field 'descDependencia'.
     */
    public java.lang.String getDescDependencia()
    {
        return this._descDependencia;
    } //-- java.lang.String getDescDependencia() 

    /**
     * Returns the value of field 'descEmpresa'.
     * 
     * @return String
     * @return the value of field 'descEmpresa'.
     */
    public java.lang.String getDescEmpresa()
    {
        return this._descEmpresa;
    } //-- java.lang.String getDescEmpresa() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'filial'.
     * 
     * @return int
     * @return the value of field 'filial'.
     */
    public int getFilial()
    {
        return this._filial;
    } //-- int getFilial() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias[] getOcorrencias() 

    /**
     * Method getOcorrenciasCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasCount()
    {
        return _ocorrenciasList.size();
    } //-- int getOcorrenciasCount() 

    /**
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

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
     * Method hasCodGrupoFim
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupoFim()
    {
        return this._has_codGrupoFim;
    } //-- boolean hasCodGrupoFim() 

    /**
     * Method hasCodGrupoInicio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupoInicio()
    {
        return this._has_codGrupoInicio;
    } //-- boolean hasCodGrupoInicio() 

    /**
     * Method hasControle
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasControle()
    {
        return this._has_controle;
    } //-- boolean hasControle() 

    /**
     * Method hasCpfCnpj
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCpfCnpj()
    {
        return this._has_cpfCnpj;
    } //-- boolean hasCpfCnpj() 

    /**
     * Method hasFilial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasFilial()
    {
        return this._has_filial;
    } //-- boolean hasFilial() 

    /**
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Method removeAllOcorrencias
     * 
     */
    public void removeAllOcorrencias()
    {
        _ocorrenciasList.removeAllElements();
    } //-- void removeAllOcorrencias() 

    /**
     * Method removeOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias removeOcorrencias(int) 

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
     * Sets the value of field 'codGrupoFim'.
     * 
     * @param codGrupoFim the value of field 'codGrupoFim'.
     */
    public void setCodGrupoFim(int codGrupoFim)
    {
        this._codGrupoFim = codGrupoFim;
        this._has_codGrupoFim = true;
    } //-- void setCodGrupoFim(int) 

    /**
     * Sets the value of field 'codGrupoInicio'.
     * 
     * @param codGrupoInicio the value of field 'codGrupoInicio'.
     */
    public void setCodGrupoInicio(int codGrupoInicio)
    {
        this._codGrupoInicio = codGrupoInicio;
        this._has_codGrupoInicio = true;
    } //-- void setCodGrupoInicio(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

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
     * Sets the value of field 'codTipoBalancete'.
     * 
     * @param codTipoBalancete the value of field 'codTipoBalancete'
     */
    public void setCodTipoBalancete(java.lang.String codTipoBalancete)
    {
        this._codTipoBalancete = codTipoBalancete;
    } //-- void setCodTipoBalancete(java.lang.String) 

    /**
     * Sets the value of field 'controle'.
     * 
     * @param controle the value of field 'controle'.
     */
    public void setControle(int controle)
    {
        this._controle = controle;
        this._has_controle = true;
    } //-- void setControle(int) 

    /**
     * Sets the value of field 'cpfCnpj'.
     * 
     * @param cpfCnpj the value of field 'cpfCnpj'.
     */
    public void setCpfCnpj(long cpfCnpj)
    {
        this._cpfCnpj = cpfCnpj;
        this._has_cpfCnpj = true;
    } //-- void setCpfCnpj(long) 

    /**
     * Sets the value of field 'descDependencia'.
     * 
     * @param descDependencia the value of field 'descDependencia'.
     */
    public void setDescDependencia(java.lang.String descDependencia)
    {
        this._descDependencia = descDependencia;
    } //-- void setDescDependencia(java.lang.String) 

    /**
     * Sets the value of field 'descEmpresa'.
     * 
     * @param descEmpresa the value of field 'descEmpresa'.
     */
    public void setDescEmpresa(java.lang.String descEmpresa)
    {
        this._descEmpresa = descEmpresa;
    } //-- void setDescEmpresa(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'filial'.
     * 
     * @param filial the value of field 'filial'.
     */
    public void setFilial(int filial)
    {
        this._filial = filial;
        this._has_filial = true;
    } //-- void setFilial(int) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias) 

    /**
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarBalancetesResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.ListarBalancetesResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.ListarBalancetesResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.ListarBalancetesResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.ListarBalancetesResponse unmarshal(java.io.Reader) 

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
