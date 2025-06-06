/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.3 2017/09/08 16:40:53 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request;

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
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/09/08 16:40:53 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codGrupo
     */
    private int _codGrupo = 0;

    /**
     * keeps track of state for field: _codGrupo
     */
    private boolean _has_codGrupo;

    /**
     * Field _codSegGrupo
     */
    private int _codSegGrupo = 0;

    /**
     * keeps track of state for field: _codSegGrupo
     */
    private boolean _has_codSegGrupo;

    /**
     * Field _conta
     */
    private int _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _codigoTipoServico
     */
    private int _codigoTipoServico = 0;

    /**
     * keeps track of state for field: _codigoTipoServico
     */
    private boolean _has_codigoTipoServico;

    /**
     * Field _itemLeiComplementar
     */
    private int _itemLeiComplementar = 0;

    /**
     * keeps track of state for field: _itemLeiComplementar
     */
    private boolean _has_itemLeiComplementar;

    /**
     * Field _codigoUsuario
     */
    private long _codigoUsuario = 0;

    /**
     * keeps track of state for field: _codigoUsuario
     */
    private boolean _has_codigoUsuario;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodGrupo
     * 
     */
    public void deleteCodGrupo()
    {
        this._has_codGrupo= false;
    } //-- void deleteCodGrupo() 

    /**
     * Method deleteCodSegGrupo
     * 
     */
    public void deleteCodSegGrupo()
    {
        this._has_codSegGrupo= false;
    } //-- void deleteCodSegGrupo() 

    /**
     * Method deleteCodigoTipoServico
     * 
     */
    public void deleteCodigoTipoServico()
    {
        this._has_codigoTipoServico= false;
    } //-- void deleteCodigoTipoServico() 

    /**
     * Method deleteCodigoUsuario
     * 
     */
    public void deleteCodigoUsuario()
    {
        this._has_codigoUsuario= false;
    } //-- void deleteCodigoUsuario() 

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Method deleteItemLeiComplementar
     * 
     */
    public void deleteItemLeiComplementar()
    {
        this._has_itemLeiComplementar= false;
    } //-- void deleteItemLeiComplementar() 

    /**
     * Returns the value of field 'codGrupo'.
     * 
     * @return int
     * @return the value of field 'codGrupo'.
     */
    public int getCodGrupo()
    {
        return this._codGrupo;
    } //-- int getCodGrupo() 

    /**
     * Returns the value of field 'codSegGrupo'.
     * 
     * @return int
     * @return the value of field 'codSegGrupo'.
     */
    public int getCodSegGrupo()
    {
        return this._codSegGrupo;
    } //-- int getCodSegGrupo() 

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
     * Returns the value of field 'codigoUsuario'.
     * 
     * @return long
     * @return the value of field 'codigoUsuario'.
     */
    public long getCodigoUsuario()
    {
        return this._codigoUsuario;
    } //-- long getCodigoUsuario() 

    /**
     * Returns the value of field 'conta'.
     * 
     * @return int
     * @return the value of field 'conta'.
     */
    public int getConta()
    {
        return this._conta;
    } //-- int getConta() 

    /**
     * Returns the value of field 'itemLeiComplementar'.
     * 
     * @return int
     * @return the value of field 'itemLeiComplementar'.
     */
    public int getItemLeiComplementar()
    {
        return this._itemLeiComplementar;
    } //-- int getItemLeiComplementar() 

    /**
     * Method hasCodGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupo()
    {
        return this._has_codGrupo;
    } //-- boolean hasCodGrupo() 

    /**
     * Method hasCodSegGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSegGrupo()
    {
        return this._has_codSegGrupo;
    } //-- boolean hasCodSegGrupo() 

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
     * Method hasCodigoUsuario
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUsuario()
    {
        return this._has_codigoUsuario;
    } //-- boolean hasCodigoUsuario() 

    /**
     * Method hasConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasConta()
    {
        return this._has_conta;
    } //-- boolean hasConta() 

    /**
     * Method hasItemLeiComplementar
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasItemLeiComplementar()
    {
        return this._has_itemLeiComplementar;
    } //-- boolean hasItemLeiComplementar() 

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
     * Sets the value of field 'codGrupo'.
     * 
     * @param codGrupo the value of field 'codGrupo'.
     */
    public void setCodGrupo(int codGrupo)
    {
        this._codGrupo = codGrupo;
        this._has_codGrupo = true;
    } //-- void setCodGrupo(int) 

    /**
     * Sets the value of field 'codSegGrupo'.
     * 
     * @param codSegGrupo the value of field 'codSegGrupo'.
     */
    public void setCodSegGrupo(int codSegGrupo)
    {
        this._codSegGrupo = codSegGrupo;
        this._has_codSegGrupo = true;
    } //-- void setCodSegGrupo(int) 

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
     * Sets the value of field 'codigoUsuario'.
     * 
     * @param codigoUsuario the value of field 'codigoUsuario'.
     */
    public void setCodigoUsuario(long codigoUsuario)
    {
        this._codigoUsuario = codigoUsuario;
        this._has_codigoUsuario = true;
    } //-- void setCodigoUsuario(long) 

    /**
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(int conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(int) 

    /**
     * Sets the value of field 'itemLeiComplementar'.
     * 
     * @param itemLeiComplementar the value of field
     * 'itemLeiComplementar'.
     */
    public void setItemLeiComplementar(int itemLeiComplementar)
    {
        this._itemLeiComplementar = itemLeiComplementar;
        this._has_itemLeiComplementar = true;
    } //-- void setItemLeiComplementar(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.Ocorrencias unmarshal(java.io.Reader) 

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
