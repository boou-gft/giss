/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: AlterarDependenciaRequest.java,v 1.3 2017/07/06 14:31:57 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request;

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
 * Class AlterarDependenciaRequest.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/07/06 14:31:57 $
 */
public class AlterarDependenciaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroUnidadeOrganizacional
     */
    private int _numeroUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field: _numeroUnidadeOrganizacional
     */
    private boolean _has_numeroUnidadeOrganizacional;

    /**
     * Field _indicadorTributavel
     */
    private int _indicadorTributavel = 0;

    /**
     * keeps track of state for field: _indicadorTributavel
     */
    private boolean _has_indicadorTributavel;

    /**
     * Field _codigoCCM
     */
    private long _codigoCCM = 0;

    /**
     * keeps track of state for field: _codigoCCM
     */
    private boolean _has_codigoCCM;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoIncorporadora
     */
    private long _codigoIncorporadora = 0;

    /**
     * keeps track of state for field: _codigoIncorporadora
     */
    private boolean _has_codigoIncorporadora;

    /**
     * Field _sequencialIncorporadora
     */
    private int _sequencialIncorporadora = 0;

    /**
     * keeps track of state for field: _sequencialIncorporadora
     */
    private boolean _has_sequencialIncorporadora;

    /**
     * Field _inscricaoMunicipal
     */
    private java.lang.String _inscricaoMunicipal;

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _listaAlterarDepList
     */
    private java.util.Vector _listaAlterarDepList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AlterarDependenciaRequest() 
     {
        super();
        _listaAlterarDepList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.AlterarDependenciaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaAlterarDep
     * 
     * 
     * 
     * @param vListaAlterarDep
     */
    public void addListaAlterarDep(br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep vListaAlterarDep)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaAlterarDepList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaAlterarDep has a maximum of 100");
        }
        _listaAlterarDepList.addElement(vListaAlterarDep);
    } //-- void addListaAlterarDep(br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep) 

    /**
     * Method addListaAlterarDep
     * 
     * 
     * 
     * @param index
     * @param vListaAlterarDep
     */
    public void addListaAlterarDep(int index, br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep vListaAlterarDep)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaAlterarDepList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaAlterarDep has a maximum of 100");
        }
        _listaAlterarDepList.insertElementAt(vListaAlterarDep, index);
    } //-- void addListaAlterarDep(int, br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep) 

    /**
     * Method deleteCodigoCCM
     * 
     */
    public void deleteCodigoCCM()
    {
        this._has_codigoCCM= false;
    } //-- void deleteCodigoCCM() 

    /**
     * Method deleteCodigoIncorporadora
     * 
     */
    public void deleteCodigoIncorporadora()
    {
        this._has_codigoIncorporadora= false;
    } //-- void deleteCodigoIncorporadora() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteIndicadorTributavel
     * 
     */
    public void deleteIndicadorTributavel()
    {
        this._has_indicadorTributavel= false;
    } //-- void deleteIndicadorTributavel() 

    /**
     * Method deleteNumeroUnidadeOrganizacional
     * 
     */
    public void deleteNumeroUnidadeOrganizacional()
    {
        this._has_numeroUnidadeOrganizacional= false;
    } //-- void deleteNumeroUnidadeOrganizacional() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method deleteSequencialIncorporadora
     * 
     */
    public void deleteSequencialIncorporadora()
    {
        this._has_sequencialIncorporadora= false;
    } //-- void deleteSequencialIncorporadora() 

    /**
     * Method enumerateListaAlterarDep
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaAlterarDep()
    {
        return _listaAlterarDepList.elements();
    } //-- java.util.Enumeration enumerateListaAlterarDep() 

    /**
     * Returns the value of field 'codigoCCM'.
     * 
     * @return long
     * @return the value of field 'codigoCCM'.
     */
    public long getCodigoCCM()
    {
        return this._codigoCCM;
    } //-- long getCodigoCCM() 

    /**
     * Returns the value of field 'codigoIncorporadora'.
     * 
     * @return long
     * @return the value of field 'codigoIncorporadora'.
     */
    public long getCodigoIncorporadora()
    {
        return this._codigoIncorporadora;
    } //-- long getCodigoIncorporadora() 

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
     * Returns the value of field 'indicadorTributavel'.
     * 
     * @return int
     * @return the value of field 'indicadorTributavel'.
     */
    public int getIndicadorTributavel()
    {
        return this._indicadorTributavel;
    } //-- int getIndicadorTributavel() 

    /**
     * Returns the value of field 'inscricaoMunicipal'.
     * 
     * @return String
     * @return the value of field 'inscricaoMunicipal'.
     */
    public java.lang.String getInscricaoMunicipal()
    {
        return this._inscricaoMunicipal;
    } //-- java.lang.String getInscricaoMunicipal() 

    /**
     * Method getListaAlterarDep
     * 
     * 
     * 
     * @param index
     * @return ListaAlterarDep
     */
    public br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep getListaAlterarDep(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaAlterarDepList.size())) {
            throw new IndexOutOfBoundsException("getListaAlterarDep: Index value '"+index+"' not in range [0.."+(_listaAlterarDepList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep) _listaAlterarDepList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep getListaAlterarDep(int) 

    /**
     * Method getListaAlterarDep
     * 
     * 
     * 
     * @return ListaAlterarDep
     */
    public br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep[] getListaAlterarDep()
    {
        int size = _listaAlterarDepList.size();
        br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep[] mArray = new br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep) _listaAlterarDepList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep[] getListaAlterarDep() 

    /**
     * Method getListaAlterarDepCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaAlterarDepCount()
    {
        return _listaAlterarDepList.size();
    } //-- int getListaAlterarDepCount() 

    /**
     * Returns the value of field 'numeroUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field 'numeroUnidadeOrganizacional'.
     */
    public int getNumeroUnidadeOrganizacional()
    {
        return this._numeroUnidadeOrganizacional;
    } //-- int getNumeroUnidadeOrganizacional() 

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
     * Returns the value of field 'sequencialIncorporadora'.
     * 
     * @return int
     * @return the value of field 'sequencialIncorporadora'.
     */
    public int getSequencialIncorporadora()
    {
        return this._sequencialIncorporadora;
    } //-- int getSequencialIncorporadora() 

    /**
     * Method hasCodigoCCM
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoCCM()
    {
        return this._has_codigoCCM;
    } //-- boolean hasCodigoCCM() 

    /**
     * Method hasCodigoIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoIncorporadora()
    {
        return this._has_codigoIncorporadora;
    } //-- boolean hasCodigoIncorporadora() 

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
     * Method hasIndicadorTributavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIndicadorTributavel()
    {
        return this._has_indicadorTributavel;
    } //-- boolean hasIndicadorTributavel() 

    /**
     * Method hasNumeroUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroUnidadeOrganizacional()
    {
        return this._has_numeroUnidadeOrganizacional;
    } //-- boolean hasNumeroUnidadeOrganizacional() 

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
     * Method hasSequencialIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSequencialIncorporadora()
    {
        return this._has_sequencialIncorporadora;
    } //-- boolean hasSequencialIncorporadora() 

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
     * Method removeAllListaAlterarDep
     * 
     */
    public void removeAllListaAlterarDep()
    {
        _listaAlterarDepList.removeAllElements();
    } //-- void removeAllListaAlterarDep() 

    /**
     * Method removeListaAlterarDep
     * 
     * 
     * 
     * @param index
     * @return ListaAlterarDep
     */
    public br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep removeListaAlterarDep(int index)
    {
        java.lang.Object obj = _listaAlterarDepList.elementAt(index);
        _listaAlterarDepList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep removeListaAlterarDep(int) 

    /**
     * Sets the value of field 'codigoCCM'.
     * 
     * @param codigoCCM the value of field 'codigoCCM'.
     */
    public void setCodigoCCM(long codigoCCM)
    {
        this._codigoCCM = codigoCCM;
        this._has_codigoCCM = true;
    } //-- void setCodigoCCM(long) 

    /**
     * Sets the value of field 'codigoIncorporadora'.
     * 
     * @param codigoIncorporadora the value of field
     * 'codigoIncorporadora'.
     */
    public void setCodigoIncorporadora(long codigoIncorporadora)
    {
        this._codigoIncorporadora = codigoIncorporadora;
        this._has_codigoIncorporadora = true;
    } //-- void setCodigoIncorporadora(long) 

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
     * Sets the value of field 'indicadorTributavel'.
     * 
     * @param indicadorTributavel the value of field
     * 'indicadorTributavel'.
     */
    public void setIndicadorTributavel(int indicadorTributavel)
    {
        this._indicadorTributavel = indicadorTributavel;
        this._has_indicadorTributavel = true;
    } //-- void setIndicadorTributavel(int) 

    /**
     * Sets the value of field 'inscricaoMunicipal'.
     * 
     * @param inscricaoMunicipal the value of field
     * 'inscricaoMunicipal'.
     */
    public void setInscricaoMunicipal(java.lang.String inscricaoMunicipal)
    {
        this._inscricaoMunicipal = inscricaoMunicipal;
    } //-- void setInscricaoMunicipal(java.lang.String) 

    /**
     * Method setListaAlterarDep
     * 
     * 
     * 
     * @param index
     * @param vListaAlterarDep
     */
    public void setListaAlterarDep(int index, br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep vListaAlterarDep)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaAlterarDepList.size())) {
            throw new IndexOutOfBoundsException("setListaAlterarDep: Index value '"+index+"' not in range [0.." + (_listaAlterarDepList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaAlterarDep has a maximum of 100");
        }
        _listaAlterarDepList.setElementAt(vListaAlterarDep, index);
    } //-- void setListaAlterarDep(int, br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep) 

    /**
     * Method setListaAlterarDep
     * 
     * 
     * 
     * @param listaAlterarDepArray
     */
    public void setListaAlterarDep(br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep[] listaAlterarDepArray)
    {
        //-- copy array
        _listaAlterarDepList.removeAllElements();
        for (int i = 0; i < listaAlterarDepArray.length; i++) {
            _listaAlterarDepList.addElement(listaAlterarDepArray[i]);
        }
    } //-- void setListaAlterarDep(br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep) 

    /**
     * Sets the value of field 'numeroUnidadeOrganizacional'.
     * 
     * @param numeroUnidadeOrganizacional the value of field
     * 'numeroUnidadeOrganizacional'.
     */
    public void setNumeroUnidadeOrganizacional(int numeroUnidadeOrganizacional)
    {
        this._numeroUnidadeOrganizacional = numeroUnidadeOrganizacional;
        this._has_numeroUnidadeOrganizacional = true;
    } //-- void setNumeroUnidadeOrganizacional(int) 

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
     * Sets the value of field 'sequencialIncorporadora'.
     * 
     * @param sequencialIncorporadora the value of field
     * 'sequencialIncorporadora'.
     */
    public void setSequencialIncorporadora(int sequencialIncorporadora)
    {
        this._sequencialIncorporadora = sequencialIncorporadora;
        this._has_sequencialIncorporadora = true;
    } //-- void setSequencialIncorporadora(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AlterarDependenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.AlterarDependenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.AlterarDependenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.AlterarDependenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.AlterarDependenciaRequest unmarshal(java.io.Reader) 

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
