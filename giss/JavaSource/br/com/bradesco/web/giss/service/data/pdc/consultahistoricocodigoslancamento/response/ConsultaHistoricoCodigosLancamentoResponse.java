/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultaHistoricoCodigosLancamentoResponse.java,v 1.2 2017/12/05 10:15:10 jaquelinebrito Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.response;

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
 * Class ConsultaHistoricoCodigosLancamentoResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/05 10:15:10 $
 */
public class ConsultaHistoricoCodigosLancamentoResponse implements java.io.Serializable {


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
     * Field _cdLancamento
     */
    private int _cdLancamento = 0;

    /**
     * keeps track of state for field: _cdLancamento
     */
    private boolean _has_cdLancamento;

    /**
     * Field _cdLancamentoAnterior
     */
    private int _cdLancamentoAnterior = 0;

    /**
     * keeps track of state for field: _cdLancamentoAnterior
     */
    private boolean _has_cdLancamentoAnterior;

    /**
     * Field _dsComplementar
     */
    private java.lang.String _dsComplementar;

    /**
     * Field _dsComplementarAnterior
     */
    private java.lang.String _dsComplementarAnterior;

    /**
     * Field _contaContabilTributo
     */
    private long _contaContabilTributo = 0;

    /**
     * keeps track of state for field: _contaContabilTributo
     */
    private boolean _has_contaContabilTributo;

    /**
     * Field _contaContabilTributoAnterior
     */
    private long _contaContabilTributoAnterior = 0;

    /**
     * keeps track of state for field: _contaContabilTributoAnterior
     */
    private boolean _has_contaContabilTributoAnterior;

    /**
     * Field _grupoContabilAtual
     */
    private int _grupoContabilAtual = 0;

    /**
     * keeps track of state for field: _grupoContabilAtual
     */
    private boolean _has_grupoContabilAtual;

    /**
     * Field _grupoContabilAtualAnterior
     */
    private int _grupoContabilAtualAnterior = 0;

    /**
     * keeps track of state for field: _grupoContabilAtualAnterior
     */
    private boolean _has_grupoContabilAtualAnterior;

    /**
     * Field _grupoContabil
     */
    private int _grupoContabil = 0;

    /**
     * keeps track of state for field: _grupoContabil
     */
    private boolean _has_grupoContabil;

    /**
     * Field _grupoContabilAnterior
     */
    private int _grupoContabilAnterior = 0;

    /**
     * keeps track of state for field: _grupoContabilAnterior
     */
    private boolean _has_grupoContabilAnterior;

    /**
     * Field _contaContabil
     */
    private long _contaContabil = 0;

    /**
     * keeps track of state for field: _contaContabil
     */
    private boolean _has_contaContabil;

    /**
     * Field _contaContabilAnterior
     */
    private long _contaContabilAnterior = 0;

    /**
     * keeps track of state for field: _contaContabilAnterior
     */
    private boolean _has_contaContabilAnterior;

    /**
     * Field _digitoContaContabil
     */
    private int _digitoContaContabil = 0;

    /**
     * keeps track of state for field: _digitoContaContabil
     */
    private boolean _has_digitoContaContabil;

    /**
     * Field _digitoContaContabilAnterior
     */
    private int _digitoContaContabilAnterior = 0;

    /**
     * keeps track of state for field: _digitoContaContabilAnterior
     */
    private boolean _has_digitoContaContabilAnterior;

    /**
     * Field _dsLancamentoAplicadoContabil
     */
    private java.lang.String _dsLancamentoAplicadoContabil;

    /**
     * Field _dsLancamentoAplicadoContabilAnterior
     */
    private java.lang.String _dsLancamentoAplicadoContabilAnterior;

    /**
     * Field _cdItem
     */
    private int _cdItem = 0;

    /**
     * keeps track of state for field: _cdItem
     */
    private boolean _has_cdItem;

    /**
     * Field _cdItemAnterior
     */
    private int _cdItemAnterior = 0;

    /**
     * keeps track of state for field: _cdItemAnterior
     */
    private boolean _has_cdItemAnterior;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultaHistoricoCodigosLancamentoResponse() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.response.ConsultaHistoricoCodigosLancamentoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCdItem
     * 
     */
    public void deleteCdItem()
    {
        this._has_cdItem= false;
    } //-- void deleteCdItem() 

    /**
     * Method deleteCdItemAnterior
     * 
     */
    public void deleteCdItemAnterior()
    {
        this._has_cdItemAnterior= false;
    } //-- void deleteCdItemAnterior() 

    /**
     * Method deleteCdLancamento
     * 
     */
    public void deleteCdLancamento()
    {
        this._has_cdLancamento= false;
    } //-- void deleteCdLancamento() 

    /**
     * Method deleteCdLancamentoAnterior
     * 
     */
    public void deleteCdLancamentoAnterior()
    {
        this._has_cdLancamentoAnterior= false;
    } //-- void deleteCdLancamentoAnterior() 

    /**
     * Method deleteContaContabil
     * 
     */
    public void deleteContaContabil()
    {
        this._has_contaContabil= false;
    } //-- void deleteContaContabil() 

    /**
     * Method deleteContaContabilAnterior
     * 
     */
    public void deleteContaContabilAnterior()
    {
        this._has_contaContabilAnterior= false;
    } //-- void deleteContaContabilAnterior() 

    /**
     * Method deleteContaContabilTributo
     * 
     */
    public void deleteContaContabilTributo()
    {
        this._has_contaContabilTributo= false;
    } //-- void deleteContaContabilTributo() 

    /**
     * Method deleteContaContabilTributoAnterior
     * 
     */
    public void deleteContaContabilTributoAnterior()
    {
        this._has_contaContabilTributoAnterior= false;
    } //-- void deleteContaContabilTributoAnterior() 

    /**
     * Method deleteDigitoContaContabil
     * 
     */
    public void deleteDigitoContaContabil()
    {
        this._has_digitoContaContabil= false;
    } //-- void deleteDigitoContaContabil() 

    /**
     * Method deleteDigitoContaContabilAnterior
     * 
     */
    public void deleteDigitoContaContabilAnterior()
    {
        this._has_digitoContaContabilAnterior= false;
    } //-- void deleteDigitoContaContabilAnterior() 

    /**
     * Method deleteGrupoContabil
     * 
     */
    public void deleteGrupoContabil()
    {
        this._has_grupoContabil= false;
    } //-- void deleteGrupoContabil() 

    /**
     * Method deleteGrupoContabilAnterior
     * 
     */
    public void deleteGrupoContabilAnterior()
    {
        this._has_grupoContabilAnterior= false;
    } //-- void deleteGrupoContabilAnterior() 

    /**
     * Method deleteGrupoContabilAtual
     * 
     */
    public void deleteGrupoContabilAtual()
    {
        this._has_grupoContabilAtual= false;
    } //-- void deleteGrupoContabilAtual() 

    /**
     * Method deleteGrupoContabilAtualAnterior
     * 
     */
    public void deleteGrupoContabilAtualAnterior()
    {
        this._has_grupoContabilAtualAnterior= false;
    } //-- void deleteGrupoContabilAtualAnterior() 

    /**
     * Returns the value of field 'cdItem'.
     * 
     * @return int
     * @return the value of field 'cdItem'.
     */
    public int getCdItem()
    {
        return this._cdItem;
    } //-- int getCdItem() 

    /**
     * Returns the value of field 'cdItemAnterior'.
     * 
     * @return int
     * @return the value of field 'cdItemAnterior'.
     */
    public int getCdItemAnterior()
    {
        return this._cdItemAnterior;
    } //-- int getCdItemAnterior() 

    /**
     * Returns the value of field 'cdLancamento'.
     * 
     * @return int
     * @return the value of field 'cdLancamento'.
     */
    public int getCdLancamento()
    {
        return this._cdLancamento;
    } //-- int getCdLancamento() 

    /**
     * Returns the value of field 'cdLancamentoAnterior'.
     * 
     * @return int
     * @return the value of field 'cdLancamentoAnterior'.
     */
    public int getCdLancamentoAnterior()
    {
        return this._cdLancamentoAnterior;
    } //-- int getCdLancamentoAnterior() 

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
     * Returns the value of field 'contaContabil'.
     * 
     * @return long
     * @return the value of field 'contaContabil'.
     */
    public long getContaContabil()
    {
        return this._contaContabil;
    } //-- long getContaContabil() 

    /**
     * Returns the value of field 'contaContabilAnterior'.
     * 
     * @return long
     * @return the value of field 'contaContabilAnterior'.
     */
    public long getContaContabilAnterior()
    {
        return this._contaContabilAnterior;
    } //-- long getContaContabilAnterior() 

    /**
     * Returns the value of field 'contaContabilTributo'.
     * 
     * @return long
     * @return the value of field 'contaContabilTributo'.
     */
    public long getContaContabilTributo()
    {
        return this._contaContabilTributo;
    } //-- long getContaContabilTributo() 

    /**
     * Returns the value of field 'contaContabilTributoAnterior'.
     * 
     * @return long
     * @return the value of field 'contaContabilTributoAnterior'.
     */
    public long getContaContabilTributoAnterior()
    {
        return this._contaContabilTributoAnterior;
    } //-- long getContaContabilTributoAnterior() 

    /**
     * Returns the value of field 'digitoContaContabil'.
     * 
     * @return int
     * @return the value of field 'digitoContaContabil'.
     */
    public int getDigitoContaContabil()
    {
        return this._digitoContaContabil;
    } //-- int getDigitoContaContabil() 

    /**
     * Returns the value of field 'digitoContaContabilAnterior'.
     * 
     * @return int
     * @return the value of field 'digitoContaContabilAnterior'.
     */
    public int getDigitoContaContabilAnterior()
    {
        return this._digitoContaContabilAnterior;
    } //-- int getDigitoContaContabilAnterior() 

    /**
     * Returns the value of field 'dsComplementar'.
     * 
     * @return String
     * @return the value of field 'dsComplementar'.
     */
    public java.lang.String getDsComplementar()
    {
        return this._dsComplementar;
    } //-- java.lang.String getDsComplementar() 

    /**
     * Returns the value of field 'dsComplementarAnterior'.
     * 
     * @return String
     * @return the value of field 'dsComplementarAnterior'.
     */
    public java.lang.String getDsComplementarAnterior()
    {
        return this._dsComplementarAnterior;
    } //-- java.lang.String getDsComplementarAnterior() 

    /**
     * Returns the value of field 'dsLancamentoAplicadoContabil'.
     * 
     * @return String
     * @return the value of field 'dsLancamentoAplicadoContabil'.
     */
    public java.lang.String getDsLancamentoAplicadoContabil()
    {
        return this._dsLancamentoAplicadoContabil;
    } //-- java.lang.String getDsLancamentoAplicadoContabil() 

    /**
     * Returns the value of field
     * 'dsLancamentoAplicadoContabilAnterior'.
     * 
     * @return String
     * @return the value of field
     * 'dsLancamentoAplicadoContabilAnterior'.
     */
    public java.lang.String getDsLancamentoAplicadoContabilAnterior()
    {
        return this._dsLancamentoAplicadoContabilAnterior;
    } //-- java.lang.String getDsLancamentoAplicadoContabilAnterior() 

    /**
     * Returns the value of field 'grupoContabil'.
     * 
     * @return int
     * @return the value of field 'grupoContabil'.
     */
    public int getGrupoContabil()
    {
        return this._grupoContabil;
    } //-- int getGrupoContabil() 

    /**
     * Returns the value of field 'grupoContabilAnterior'.
     * 
     * @return int
     * @return the value of field 'grupoContabilAnterior'.
     */
    public int getGrupoContabilAnterior()
    {
        return this._grupoContabilAnterior;
    } //-- int getGrupoContabilAnterior() 

    /**
     * Returns the value of field 'grupoContabilAtual'.
     * 
     * @return int
     * @return the value of field 'grupoContabilAtual'.
     */
    public int getGrupoContabilAtual()
    {
        return this._grupoContabilAtual;
    } //-- int getGrupoContabilAtual() 

    /**
     * Returns the value of field 'grupoContabilAtualAnterior'.
     * 
     * @return int
     * @return the value of field 'grupoContabilAtualAnterior'.
     */
    public int getGrupoContabilAtualAnterior()
    {
        return this._grupoContabilAtualAnterior;
    } //-- int getGrupoContabilAtualAnterior() 

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
     * Method hasCdItem
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdItem()
    {
        return this._has_cdItem;
    } //-- boolean hasCdItem() 

    /**
     * Method hasCdItemAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdItemAnterior()
    {
        return this._has_cdItemAnterior;
    } //-- boolean hasCdItemAnterior() 

    /**
     * Method hasCdLancamento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdLancamento()
    {
        return this._has_cdLancamento;
    } //-- boolean hasCdLancamento() 

    /**
     * Method hasCdLancamentoAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdLancamentoAnterior()
    {
        return this._has_cdLancamentoAnterior;
    } //-- boolean hasCdLancamentoAnterior() 

    /**
     * Method hasContaContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaContabil()
    {
        return this._has_contaContabil;
    } //-- boolean hasContaContabil() 

    /**
     * Method hasContaContabilAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaContabilAnterior()
    {
        return this._has_contaContabilAnterior;
    } //-- boolean hasContaContabilAnterior() 

    /**
     * Method hasContaContabilTributo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaContabilTributo()
    {
        return this._has_contaContabilTributo;
    } //-- boolean hasContaContabilTributo() 

    /**
     * Method hasContaContabilTributoAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaContabilTributoAnterior()
    {
        return this._has_contaContabilTributoAnterior;
    } //-- boolean hasContaContabilTributoAnterior() 

    /**
     * Method hasDigitoContaContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDigitoContaContabil()
    {
        return this._has_digitoContaContabil;
    } //-- boolean hasDigitoContaContabil() 

    /**
     * Method hasDigitoContaContabilAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDigitoContaContabilAnterior()
    {
        return this._has_digitoContaContabilAnterior;
    } //-- boolean hasDigitoContaContabilAnterior() 

    /**
     * Method hasGrupoContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGrupoContabil()
    {
        return this._has_grupoContabil;
    } //-- boolean hasGrupoContabil() 

    /**
     * Method hasGrupoContabilAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGrupoContabilAnterior()
    {
        return this._has_grupoContabilAnterior;
    } //-- boolean hasGrupoContabilAnterior() 

    /**
     * Method hasGrupoContabilAtual
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGrupoContabilAtual()
    {
        return this._has_grupoContabilAtual;
    } //-- boolean hasGrupoContabilAtual() 

    /**
     * Method hasGrupoContabilAtualAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGrupoContabilAtualAnterior()
    {
        return this._has_grupoContabilAtualAnterior;
    } //-- boolean hasGrupoContabilAtualAnterior() 

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
     * Sets the value of field 'cdItem'.
     * 
     * @param cdItem the value of field 'cdItem'.
     */
    public void setCdItem(int cdItem)
    {
        this._cdItem = cdItem;
        this._has_cdItem = true;
    } //-- void setCdItem(int) 

    /**
     * Sets the value of field 'cdItemAnterior'.
     * 
     * @param cdItemAnterior the value of field 'cdItemAnterior'.
     */
    public void setCdItemAnterior(int cdItemAnterior)
    {
        this._cdItemAnterior = cdItemAnterior;
        this._has_cdItemAnterior = true;
    } //-- void setCdItemAnterior(int) 

    /**
     * Sets the value of field 'cdLancamento'.
     * 
     * @param cdLancamento the value of field 'cdLancamento'.
     */
    public void setCdLancamento(int cdLancamento)
    {
        this._cdLancamento = cdLancamento;
        this._has_cdLancamento = true;
    } //-- void setCdLancamento(int) 

    /**
     * Sets the value of field 'cdLancamentoAnterior'.
     * 
     * @param cdLancamentoAnterior the value of field
     * 'cdLancamentoAnterior'.
     */
    public void setCdLancamentoAnterior(int cdLancamentoAnterior)
    {
        this._cdLancamentoAnterior = cdLancamentoAnterior;
        this._has_cdLancamentoAnterior = true;
    } //-- void setCdLancamentoAnterior(int) 

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
     * Sets the value of field 'contaContabil'.
     * 
     * @param contaContabil the value of field 'contaContabil'.
     */
    public void setContaContabil(long contaContabil)
    {
        this._contaContabil = contaContabil;
        this._has_contaContabil = true;
    } //-- void setContaContabil(long) 

    /**
     * Sets the value of field 'contaContabilAnterior'.
     * 
     * @param contaContabilAnterior the value of field
     * 'contaContabilAnterior'.
     */
    public void setContaContabilAnterior(long contaContabilAnterior)
    {
        this._contaContabilAnterior = contaContabilAnterior;
        this._has_contaContabilAnterior = true;
    } //-- void setContaContabilAnterior(long) 

    /**
     * Sets the value of field 'contaContabilTributo'.
     * 
     * @param contaContabilTributo the value of field
     * 'contaContabilTributo'.
     */
    public void setContaContabilTributo(long contaContabilTributo)
    {
        this._contaContabilTributo = contaContabilTributo;
        this._has_contaContabilTributo = true;
    } //-- void setContaContabilTributo(long) 

    /**
     * Sets the value of field 'contaContabilTributoAnterior'.
     * 
     * @param contaContabilTributoAnterior the value of field
     * 'contaContabilTributoAnterior'.
     */
    public void setContaContabilTributoAnterior(long contaContabilTributoAnterior)
    {
        this._contaContabilTributoAnterior = contaContabilTributoAnterior;
        this._has_contaContabilTributoAnterior = true;
    } //-- void setContaContabilTributoAnterior(long) 

    /**
     * Sets the value of field 'digitoContaContabil'.
     * 
     * @param digitoContaContabil the value of field
     * 'digitoContaContabil'.
     */
    public void setDigitoContaContabil(int digitoContaContabil)
    {
        this._digitoContaContabil = digitoContaContabil;
        this._has_digitoContaContabil = true;
    } //-- void setDigitoContaContabil(int) 

    /**
     * Sets the value of field 'digitoContaContabilAnterior'.
     * 
     * @param digitoContaContabilAnterior the value of field
     * 'digitoContaContabilAnterior'.
     */
    public void setDigitoContaContabilAnterior(int digitoContaContabilAnterior)
    {
        this._digitoContaContabilAnterior = digitoContaContabilAnterior;
        this._has_digitoContaContabilAnterior = true;
    } //-- void setDigitoContaContabilAnterior(int) 

    /**
     * Sets the value of field 'dsComplementar'.
     * 
     * @param dsComplementar the value of field 'dsComplementar'.
     */
    public void setDsComplementar(java.lang.String dsComplementar)
    {
        this._dsComplementar = dsComplementar;
    } //-- void setDsComplementar(java.lang.String) 

    /**
     * Sets the value of field 'dsComplementarAnterior'.
     * 
     * @param dsComplementarAnterior the value of field
     * 'dsComplementarAnterior'.
     */
    public void setDsComplementarAnterior(java.lang.String dsComplementarAnterior)
    {
        this._dsComplementarAnterior = dsComplementarAnterior;
    } //-- void setDsComplementarAnterior(java.lang.String) 

    /**
     * Sets the value of field 'dsLancamentoAplicadoContabil'.
     * 
     * @param dsLancamentoAplicadoContabil the value of field
     * 'dsLancamentoAplicadoContabil'.
     */
    public void setDsLancamentoAplicadoContabil(java.lang.String dsLancamentoAplicadoContabil)
    {
        this._dsLancamentoAplicadoContabil = dsLancamentoAplicadoContabil;
    } //-- void setDsLancamentoAplicadoContabil(java.lang.String) 

    /**
     * Sets the value of field
     * 'dsLancamentoAplicadoContabilAnterior'.
     * 
     * @param dsLancamentoAplicadoContabilAnterior the value of
     * field 'dsLancamentoAplicadoContabilAnterior'.
     */
    public void setDsLancamentoAplicadoContabilAnterior(java.lang.String dsLancamentoAplicadoContabilAnterior)
    {
        this._dsLancamentoAplicadoContabilAnterior = dsLancamentoAplicadoContabilAnterior;
    } //-- void setDsLancamentoAplicadoContabilAnterior(java.lang.String) 

    /**
     * Sets the value of field 'grupoContabil'.
     * 
     * @param grupoContabil the value of field 'grupoContabil'.
     */
    public void setGrupoContabil(int grupoContabil)
    {
        this._grupoContabil = grupoContabil;
        this._has_grupoContabil = true;
    } //-- void setGrupoContabil(int) 

    /**
     * Sets the value of field 'grupoContabilAnterior'.
     * 
     * @param grupoContabilAnterior the value of field
     * 'grupoContabilAnterior'.
     */
    public void setGrupoContabilAnterior(int grupoContabilAnterior)
    {
        this._grupoContabilAnterior = grupoContabilAnterior;
        this._has_grupoContabilAnterior = true;
    } //-- void setGrupoContabilAnterior(int) 

    /**
     * Sets the value of field 'grupoContabilAtual'.
     * 
     * @param grupoContabilAtual the value of field
     * 'grupoContabilAtual'.
     */
    public void setGrupoContabilAtual(int grupoContabilAtual)
    {
        this._grupoContabilAtual = grupoContabilAtual;
        this._has_grupoContabilAtual = true;
    } //-- void setGrupoContabilAtual(int) 

    /**
     * Sets the value of field 'grupoContabilAtualAnterior'.
     * 
     * @param grupoContabilAtualAnterior the value of field
     * 'grupoContabilAtualAnterior'.
     */
    public void setGrupoContabilAtualAnterior(int grupoContabilAtualAnterior)
    {
        this._grupoContabilAtualAnterior = grupoContabilAtualAnterior;
        this._has_grupoContabilAtualAnterior = true;
    } //-- void setGrupoContabilAtualAnterior(int) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultaHistoricoCodigosLancamentoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.response.ConsultaHistoricoCodigosLancamentoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.response.ConsultaHistoricoCodigosLancamentoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.response.ConsultaHistoricoCodigosLancamentoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.response.ConsultaHistoricoCodigosLancamentoResponse unmarshal(java.io.Reader) 

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
